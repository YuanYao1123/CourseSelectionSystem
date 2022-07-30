package service;

import dao.CourseDao;
import dao.CourseDaoImpl;
import dao.CourseSelectionDao;
import dao.CourseSelectionDaoImpl;
import model.Course;
import utility.DBUtil;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SelectedAllCoursesAndStudentsService {
    private static List<Object[]> courseList;

    public List<Object[]> getAllSelectedCourses(){
        Connection conn = null;
        try {
            conn = DBUtil.getConnection();
            CourseDao courseDao = new CourseDaoImpl();
            List<Object[]> allCourseSelectionsInfo = courseDao.getAllCourseSelectionsInfo(conn);
            courseList = allCourseSelectionsInfo;
            return courseList;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            DBUtil.closeResources(conn, null, null);
        }
    }

    public List<Object[]> getCourseListSortedByCourseName(){
        courseList.sort(new Comparator<Object[]>() {
            @Override
            public int compare(Object[] o1, Object[] o2) {
                String s1=o1[3].toString();
                String s2=o2[3].toString();
                return s1.compareTo(s2);
            }
        });
        return courseList;
    }

    public List<Object[]> getCourseListSortedByStudentName(){
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

    public List<Object[]> getSearchedObjectByStudentName(String courseName){
        List<Object[]> searchedCourseList=new ArrayList<>();
        for (Object[] course : courseList) {
            if (course[1].toString().contains(courseName)){
                searchedCourseList.add(course);
            }
        }
        return searchedCourseList;
    }

    public List<Object[]> getSearchedObjectByCourseName(String courseName){
        List<Object[]> searchedCourseList=new ArrayList<>();
        for (Object[] course : courseList) {
            if (course[3].toString().contains(courseName)){
                searchedCourseList.add(course);
            }
        }
        return searchedCourseList;
    }

    public int deleteSelectedCourseSelection(String studentID, String courseID) {
        Connection conn=null;
        try {
            conn = DBUtil.getConnection();
            conn.setAutoCommit(false);
            CourseSelectionDao courseSelectionDao=new CourseSelectionDaoImpl();
            int flag1 = courseSelectionDao.delete(conn, studentID, courseID);
            CourseDao dao=new CourseDaoImpl();
            Course course = dao.getCourseByID(conn, courseID);
            if (course!=null) {
                course.setCapacity(course.getCapacity() + 1);
                int flag2 = dao.modifyCourse(conn, course);
                if (flag1 == 1 && flag2 == 1) {
                    conn.commit();
                    return 1;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }  finally {
            DBUtil.closeResources(conn,null,null);
        }
        return 0;
    }
}
