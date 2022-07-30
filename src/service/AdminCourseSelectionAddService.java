package service;

import dao.CourseDao;
import dao.CourseDaoImpl;
import dao.CourseSelectionDao;
import dao.CourseSelectionDaoImpl;
import model.Course;
import model.CourseSelection;
import utility.DBUtil;

import java.sql.Connection;

public class AdminCourseSelectionAddService {
    public CourseSelectionDao courseSelectionDao;

    public AdminCourseSelectionAddService() {
        courseSelectionDao =new CourseSelectionDaoImpl();
    }

    public int addCourseSelection(String studentID,String courseID){
        Connection conn=null;
        CourseSelection courseSelection=new CourseSelection(studentID,courseID,null);
        CourseDao courseDao=new CourseDaoImpl();
        try {
            conn = DBUtil.getConnection();
            int flag1= courseSelectionDao.add(conn,courseSelection);
            Course course = courseDao.getCourseByID(conn, courseSelection.getCourseID());
            course.setCapacity(course.getCapacity()-1);
            int flag2=courseDao.modifyCourse(conn,course);
            if(flag1==1 && flag2==1 && course!=null) {
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
