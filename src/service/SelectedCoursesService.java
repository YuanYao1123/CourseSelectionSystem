package service;

import dao.CourseDao;
import dao.CourseDaoImpl;
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

}
