package dao;

import model.CourseSelection;
import org.junit.jupiter.api.Test;
import utility.DBUtil;

import java.sql.Connection;
import java.util.Random;

public class CourseSelectionDaoImpl extends BaseDAO<CourseSelection> implements CourseSelectionDao{
    @Override
    public int add(Connection conn, CourseSelection courseSelection) {
        String sql="insert into course_selection (stu_id, course_id, grade) values (?,?,null)";
        return update(conn,sql,courseSelection.getStuID(),courseSelection.getCourseID());
    }

    @Override
    public int delete(Connection conn, String studentID, String courseID) {
        String sql="delete from course_selection where stu_id=? and course_id=?";
        return update(conn,sql,studentID,courseID);
    }

    @Override
    public int modify(Connection conn,String oldCourseID, CourseSelection courseSelection) {
        String sql="update course_selection set course_id = ? where stu_id=? and course_id=?";
        return update(conn,sql,courseSelection.getCourseID(),courseSelection.getStuID(),oldCourseID);
    }

    public int batchAddData(){
        Connection conn=null;
        try {
            conn = DBUtil.getConnection();
            String sql = "insert into course_selection (stu_id, course_id, grade) values (?,?,null)";
            Random random=new Random();
            for (int i = 0; i < 1001; i++) {
                update(conn, sql,"10021"+(int)(3+Math.random()*997),"2022"+(int)(1+Math.random()*999));
            }
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            DBUtil.closeResources(conn,null,null);
        }
    }

    @Test
    public void testBatchAddData(){
        CourseSelectionDaoImpl courseDao=new CourseSelectionDaoImpl();
        batchAddData();
    }
}
