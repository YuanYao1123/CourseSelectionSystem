package service;

import dao.CourseDao;
import dao.CourseDaoImpl;
import utility.DBUtil;

import java.sql.Connection;
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

    public Object[] getSearchedObjectByStudentName(String courseName){
        for (Object[] course : courseList) {
            if (courseName.equals(course[1].toString())){
                return course;
            }
        }
        return null;
    }

    public Object[] getSearchedObjectByCourseName(String courseName){
        for (Object[] course : courseList) {
            if (courseName.equals(course[3].toString())){
                return course;
            }
        }
        return null;
    }
}
