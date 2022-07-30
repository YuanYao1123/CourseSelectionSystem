package service;

import dao.CourseDao;
import dao.CourseDaoImpl;
import dao.CourseSelectionDaoImpl;
import model.Course;
import model.CourseSelection;
import utility.DBUtil;

import java.sql.Connection;

public class AdminCourseAddService {
    public CourseDao courseDao;

    public AdminCourseAddService() {
        courseDao=new CourseDaoImpl();
    }

    public int addCourse(String ID,String courseName,int capacity,String type,String lecture){
        Connection conn=null;
        Course course=new Course(ID,courseName,capacity,type,lecture);
        try {
            conn = DBUtil.getConnection();
            if(courseDao.addCourse(conn,course)==1) {
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
