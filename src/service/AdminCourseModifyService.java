package service;

import dao.CourseDao;
import dao.CourseDaoImpl;
import model.Course;
import utility.DBUtil;

import java.sql.Connection;

public class AdminCourseModifyService {
    public CourseDao courseDao;

    public AdminCourseModifyService() {
        courseDao=new CourseDaoImpl();
    }

    public int modify(String ID,String courseName,int capacity,String type,String lecture){
        Connection conn=null;
        Course course=new Course(ID,courseName,capacity,type,lecture);
        try {
            conn = DBUtil.getConnection();
            if(courseDao.modifyCourse(conn,course)==1) {
                return 1;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }  finally {
            DBUtil.closeResources(conn,null,null);
        }
        return 0;
    }
}
