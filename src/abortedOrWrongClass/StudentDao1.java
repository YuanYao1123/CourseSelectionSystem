/*
package dao;

import model.Student;
import utility.DBUtil;

import javax.xml.transform.Result;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentDao {
    public int add(Student stu) throws SQLException {
        Connection con = DBUtil.getConnection();
        String sql="insert into student (student_id, name, gender, age, country, major, intake, semester, graduate_year) values (?,?,?,?,?,?,?,?,?)";
        PreparedStatement preparedStatement = con.prepareStatement(sql);
        preparedStatement.setString(1,stu.getStudentID());
        preparedStatement.setString(2,stu.getName());
        preparedStatement.setString(3,stu.getGender());
        preparedStatement.setInt(4,stu.getAge());
        preparedStatement.setString(5,stu.getCountry());
        preparedStatement.setString(6,stu.getMajor());
        preparedStatement.setString(7,stu.getIntake());
        preparedStatement.setString(8,stu.getSemester());
        preparedStatement.setInt(9,stu.getGraduateYear());
        int i = preparedStatement.executeUpdate();
        return i;
    }

    public int delete(Student stu) throws SQLException {
        Connection con=DBUtil.getConnection();
        String sql="delete from student where student_id=?";
        PreparedStatement preparedStatement = con.prepareStatement(sql);
        preparedStatement.setString(1,stu.getStudentID());
        int i = preparedStatement.executeUpdate();
        return i;
    }

    public int update(Student stu) throws SQLException {
        Connection con=DBUtil.getConnection();
        String sql="update student set name=? and gender=? and age=? and country=? and major=? and intake=? and semester=? and graduate_year=? where student_id=?";
        PreparedStatement preparedStatement = con.prepareStatement(sql);
        preparedStatement.setString(1,stu.getName());
        preparedStatement.setString(2,stu.getGender());
        preparedStatement.setInt(3,stu.getAge());
        preparedStatement.setString(4,stu.getCountry());
        preparedStatement.setString(5,stu.getMajor());
        preparedStatement.setString(6,stu.getIntake());
        preparedStatement.setString(7,stu.getSemester());
        preparedStatement.setInt(8,stu.getGraduateYear());
        preparedStatement.setString(9,stu.getStudentID());
        int i = preparedStatement.executeUpdate();
        return i;
    }

    public ResultSet searchAll() throws SQLException {
        Connection con=DBUtil.getConnection();
        String sql="select * from student";
        PreparedStatement preparedStatement = con.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();
        return resultSet;
    }

    public ResultSet SearchById(Student student) throws SQLException {
        Connection con=DBUtil.getConnection();
        String sql="select * from student where student_id=?";
        PreparedStatement preparedStatement = con.prepareStatement(sql);
        preparedStatement.setString(1,student.getStudentID());
        ResultSet resultSet = preparedStatement.executeQuery();
        return resultSet;
    }

    public ResultSet searchAndSortedAllBy(String columnName) throws SQLException {
        Connection con=DBUtil.getConnection();
        String sql="select * from student order by ?";
        PreparedStatement preparedStatement = con.prepareStatement(sql);
        preparedStatement.setString(1,columnName);
        ResultSet resultSet = preparedStatement.executeQuery();
        return resultSet;
    }

    public ResultSet searchByName(Student stu) throws SQLException {
        Connection con=DBUtil.getConnection();
        String sql="select * from student where name=?";
        PreparedStatement preparedStatement = con.prepareStatement(sql);
        preparedStatement.setString(1,stu.getName());
        ResultSet resultSet = preparedStatement.executeQuery();
        return resultSet;
    }
}
*/
