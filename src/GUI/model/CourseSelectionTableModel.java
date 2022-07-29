package GUI.model;

import GUI.frame.CourseSelection;
import model.Course;
import service.CourseSelectionService;
import service.LoginWindowService;

import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class CourseSelectionTableModel {
    private CourseSelection courseSelection;
    private DefaultTableModel defaultTableModel;

    public CourseSelectionTableModel(CourseSelection courseSelection) {
        this.courseSelection = courseSelection;
        defaultTableModel= (DefaultTableModel) courseSelection.courseInfoTable.getModel();
    }

    public void fillData(){
        CourseSelectionService service=new CourseSelectionService();
        List<Course> unselectedCourseList = service.getUnselectedCourseList(LoginWindowService.userID);
        Vector<Vector<String>> coursesStringVector = convert(unselectedCourseList);
        defaultTableModel.setRowCount(0);
        for (Vector<String > course :
                coursesStringVector) {
            defaultTableModel.addRow(course);
        }
    }

    public void fillData(Course course){
        List<Course> listCourse=new ArrayList<>();
        listCourse.add(course);
        Vector<Vector<String>> courseStringVector = convert(listCourse);
        defaultTableModel.setRowCount(0);
        defaultTableModel.addRow(courseStringVector.get(0));

    }

    public void fillData(List<Course> courseList){
        Vector<Vector<String>> coursesStringVector = convert(courseList);
        defaultTableModel.setRowCount(0);
        for (Vector<String> course :
                coursesStringVector) {
            defaultTableModel.addRow(course);
        }
    }

    public  Vector<Vector<String>> convert(List<Course> list){
        Vector<Vector<String>> vectorCourses=new Vector<>();
        for (Course course :
                list) {
            Vector<String> vector=new Vector<>();
            vector.add(course.getID());
            vector.add(course.getCourseName());
            vector.add(String.valueOf(course.getCapacity()));
            vector.add(course.getType());
            vector.add(course.getLecture());
            vectorCourses.add(vector);
        }
        return vectorCourses;
    }
}
