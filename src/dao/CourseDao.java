package dao;

import model.Course;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public interface CourseDao {
    int addCourse(Connection conn, Course course);
    int deleteCourse(Connection conn,String id);
    int modifyCourse(Connection conn, Course course);
    List<Course> getAllUnselectedCourses(Connection conn,String id);
    List<Course> getAllCourses(Connection conn);

    /**
     * Object[]: course id, course name, lecture, and grade. multi table search
     * @param conn
     * @param id
     * @return
     */
    List<Object[]> getAllSelectedCoursesAndItsGrade(Connection conn,String id);

    /**
     * get all course selection information, including its student and course information
     * @param conn
     * @return
     */
    List<Object[]> getAllCourseSelectionsInfo(Connection conn);


    Course getCourseByID(Connection conn,String ID);

}
