package service;

import dao.CourseDao;
import dao.CourseDaoImpl;
import dao.CourseSelectionDao;
import dao.CourseSelectionDaoImpl;
import model.Course;
import model.CourseSelection;
import utility.DBUtil;

import java.sql.Connection;

public class AdminCourseSelectionModifyService {
    public CourseSelectionDao courseSelectionDao;

    public AdminCourseSelectionModifyService() {
        courseSelectionDao = new CourseSelectionDaoImpl();
    }

    public int modifyCourseSelection(String oldCourseID, String studentID, String courseID) {
        Connection conn = null;
        CourseSelection courseSelection = new CourseSelection(studentID, courseID, null);
        CourseDao courseDao = new CourseDaoImpl();
        try {
            conn = DBUtil.getConnection();
            conn.setAutoCommit(false);
            int flag1 = courseSelectionDao.modify(conn, oldCourseID, courseSelection);
            Course oldCourse = courseDao.getCourseByID(conn, oldCourseID);
            oldCourse.setCapacity(oldCourse.getCapacity() + 1);
            Course course = courseDao.getCourseByID(conn, courseSelection.getCourseID());
            course.setCapacity(course.getCapacity() - 1);     //maybe null pointer exception, jump to catch then return 0
            int flag2 = courseDao.modifyCourse(conn, oldCourse);
            int flag3 = courseDao.modifyCourse(conn, course);
            if (flag1 == 1 && flag2 == 1 && flag3 == 1 ) {
                conn.commit();
                return 1;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBUtil.closeResources(conn, null, null);
        }
        return 0;
    }
}
