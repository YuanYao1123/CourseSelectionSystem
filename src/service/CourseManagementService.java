package service;

import dao.CourseDao;
import dao.CourseDaoImpl;
import dao.CourseSelectionDao;
import dao.CourseSelectionDaoImpl;
import model.Course;
import utility.DBUtil;

import java.sql.Connection;
import java.util.Comparator;
import java.util.List;

public class CourseManagementService {
    private static List<Course> courseList;

    public List<Course> getAllCourses(){
        Connection conn = null;
        try {
            conn = DBUtil.getConnection();
            CourseDao courseDao = new CourseDaoImpl();
            List<Course> allCoursesList = courseDao.getAllCourses(conn);
            courseList = allCoursesList;
            return courseList;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            DBUtil.closeResources(conn, null, null);
        }
    }

    public List<Course> getCourseListSortedByCourseName() {
        courseList.sort(new Comparator<Course>() {
            @Override
            public int compare(Course o1, Course o2) {
                return o1.getCourseName().compareTo(o2.getCourseName());
            }
        });
        return courseList;
    }


    public Course getSearchedObjectByCourseName(String courseName){
        for (Course course : courseList) {
            if (courseName.equals(course.getCourseName())){
                return course;
            }
        }
        return null;
    }

    public int deleteCourse(String courseID) {
        Connection conn=null;
        try {
            conn = DBUtil.getConnection();
            CourseDao courseDao=new CourseDaoImpl();
            if(courseDao.deleteCourse(conn,courseID)>0){
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
}
