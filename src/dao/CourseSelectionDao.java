package dao;

import model.Course;
import model.CourseSelection;

import java.sql.Connection;

public interface CourseSelectionDao {
    int add(Connection conn, CourseSelection courseSelection);
    int delete(Connection conn,String studentID,String courseID);
    int modify(Connection conn, CourseSelection courseSelection);
}
