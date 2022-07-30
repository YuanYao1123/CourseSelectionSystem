package GUI.model;

import GUI.frame.SelectedAllCoursesAndStudents;
import GUI.frame.SelectedCourses;
import service.LoginWindowService;
import service.SelectedAllCoursesAndStudentsService;
import service.SelectedCoursesService;

import javax.swing.table.DefaultTableModel;
import java.util.List;

public class SelectedAllCoursesAndItsStudentsTableModel {
    private SelectedAllCoursesAndStudents instance;
    private DefaultTableModel defaultTableModel;
    private SelectedAllCoursesAndStudentsService service;

    public SelectedAllCoursesAndItsStudentsTableModel(SelectedAllCoursesAndStudents instance) {
        this.instance = instance;
        defaultTableModel= (DefaultTableModel) instance.courseSelectedTable.getModel();
        service=new SelectedAllCoursesAndStudentsService();
    }

    public void fillData(){
        List<Object[]> selectedCoursesAndItsGrade = service.getAllSelectedCourses();
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
