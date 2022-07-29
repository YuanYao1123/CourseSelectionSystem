package service;

import dao.CourseDao;
import dao.CourseDaoImpl;
import dao.CourseSelectionDaoImpl;
import model.Course;
import model.CourseSelection;
import utility.DBUtil;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CourseSelectionService {
    private static List<Course> courseList;

    public List<Course> getUnselectedCourseList(String id) {
        Connection conn = null;
        try {
            conn = DBUtil.getConnection();
            CourseDao courseDao = new CourseDaoImpl();
            courseList=courseDao.getAllUnselectedCourses(conn, id);
            return courseList;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            DBUtil.closeResources(conn, null, null);
        }
    }


    public List<Course> getCourseListSortedByName(){
        courseList.sort(new Comparator<Course>() {
            @Override
            public int compare(Course o1, Course o2) {
                return o1.getCourseName().compareTo(o2.getCourseName());
            }
        });
        return courseList;
    }

    public Course getSearchedObject(String courseName){
        for (Course course : courseList) {
            if (courseName.equals(course.getCourseName())){
                return course;
            }
        }
        return null;
    }

    public int addCourse(List<CourseSelection> courseSelectionList) {
        Connection conn=null;
        try {
            conn = DBUtil.getConnection();
            CourseSelectionDaoImpl courseSelectionDao=new CourseSelectionDaoImpl();
            CourseDao courseDao=new CourseDaoImpl();
            for (CourseSelection courseSelection :  courseSelectionList) {
                Course course = courseDao.getCourseByID(conn, courseSelection.getCourseID());
                if(courseSelectionDao.add(conn,courseSelection)>0){
                    course.setCapacity(course.getCapacity()-1);
                    courseDao.modifyCourse(conn,course);
                    return 1;
                }else {
                    return 0;
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
