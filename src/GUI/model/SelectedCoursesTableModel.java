package GUI.model;

import GUI.frame.CourseSelection;
import GUI.frame.SelectedCourses;
import model.Course;
import service.CourseSelectionService;
import service.LoginWindowService;
import service.SelectedCoursesService;

import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class SelectedCoursesTableModel {
    private SelectedCourses selectedCourses;
    private  DefaultTableModel defaultTableModel;

    public SelectedCoursesTableModel(SelectedCourses selectedCourses) {
        this.selectedCourses = selectedCourses;
        defaultTableModel= (DefaultTableModel) selectedCourses.courseSelectedTable.getModel();
    }

    public void fillData(){
        SelectedCoursesService service=new SelectedCoursesService();
        List<Object[]> selectedCoursesAndItsGrade = service.getSelectedCoursesAndItsGrade(LoginWindowService.userID);
        defaultTableModel.setRowCount(0);
        for (Object[] course :
                selectedCoursesAndItsGrade) {
            defaultTableModel.addRow(course);
        }
    }

    public void fillData(Object[] arrCourse){
        defaultTableModel.setRowCount(0);
        defaultTableModel.addRow(arrCourse);
    }

    public void fillData(List<Object[]> arrCourseList){
        defaultTableModel.setRowCount(0);
        for (Object[] arrCourse :
                arrCourseList) {
            defaultTableModel.addRow(arrCourse);
        }
    }
}
