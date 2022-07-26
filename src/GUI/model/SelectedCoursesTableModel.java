package GUI.model;

import GUI.frame.SelectedCourses;
import service.LoginWindowService;
import service.SelectedCoursesService;

import javax.swing.table.DefaultTableModel;
import java.util.List;

public class SelectedCoursesTableModel {
    private SelectedCourses instance;
    private  DefaultTableModel defaultTableModel;
    private SelectedCoursesService service;

    public SelectedCoursesTableModel(SelectedCourses instance) {
        this.instance = instance;
        defaultTableModel= (DefaultTableModel) instance.courseSelectedTable.getModel();
        service=new SelectedCoursesService();
    }

    public void fillData(){
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
