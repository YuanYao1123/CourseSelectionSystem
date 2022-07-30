package service;

import dao.CourseDao;
import dao.CourseDaoImpl;
import dao.CourseSelectionDao;
import dao.CourseSelectionDaoImpl;
import model.Course;
import model.CourseSelection;
import utility.DBUtil;
import java.sql.Connection;
import java.util.Comparator;
import java.util.List;

public class SelectedCoursesService {
    private static List<Object[]> courseList;

    public List<Object[]> getSelectedCoursesAndItsGrade(String ID){
        Connection conn = null;
        try {
            conn = DBUtil.getConnection();
            CourseDao courseDao = new CourseDaoImpl();
            courseList = courseDao.getAllSelectedCoursesAndItsGrade(conn, ID);
            return courseList;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            DBUtil.closeResources(conn, null, null);
        }
    }

    public List<Object[]> getCourseListSortedByName(){
        courseList.sort(new Comparator<Object[]>() {
            @Override
            public int compare(Object[] o1, Object[] o2) {
                String s1=o1[1].toString();
                String s2=o2[1].toString();
                return s1.compareTo(s2);
            }
        });
        return courseList;
    }

    public Object[] getSearchedObject(String courseName){
        for (Object[] course : courseList) {
            if (courseName.equals(course[1].toString())){
                return course;
            }
        }
        return null;
    }

    public int deleteSelectedCourseSelection(String studentID, String courseID) {
        Connection conn=null;
        try {
            conn = DBUtil.getConnection();
            CourseSelectionDao courseSelectionDao=new CourseSelectionDaoImpl();
            if(courseSelectionDao.delete(conn,studentID,courseID)>0){
                return 1;
            }else {
                return 0;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }  finally {
            DBUtil.closeResources(conn,null,null);
        }
        return 0;
    }

    public int deleteSelectedCourseSelection(List<CourseSelection> courseSelectionList) {
        Connection conn=null;
        try {
            conn = DBUtil.getConnection();
            conn.setAutoCommit(false);
            CourseSelectionDao courseSelectionDao=new CourseSelectionDaoImpl();
            CourseDao courseDao=new CourseDaoImpl();
            for (CourseSelection courseSelection :  courseSelectionList) {
                int flag1 = courseSelectionDao.delete(conn, courseSelection.getStuID(), courseSelection.getCourseID());
                Course course = courseDao.getCourseByID(conn, courseSelection.getCourseID());
                if (course!=null){
                    course.setCapacity(course.getCapacity()-1);
                    int flag2 = courseDao.modifyCourse(conn, course);
                    if (flag1==0 || flag2==0){
                        return 0;
                    }
                }else {
                    return 0;
                }
            }
            conn.commit();
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }  finally {
            DBUtil.closeResources(conn,null,null);
        }
    }
}
