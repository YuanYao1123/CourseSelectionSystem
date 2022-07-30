package GUI.listener;

import GUI.frame.AdminSelectedCourseAdd;
import GUI.frame.CourseAdd;
import GUI.frame.CourseManagement;
import GUI.frame.SelectedAllCoursesAndStudents;
import GUI.model.CourseManagementModel;
import GUI.model.SelectedAllCoursesAndItsStudentsTableModel;
import service.AdminCourseAddService;
import service.AdminCourseSelectionAddService;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminSelectedCourseAddListener implements ActionListener {
    private AdminSelectedCourseAdd instance;
    private SelectedAllCoursesAndStudents parentInstance;
    private AdminCourseSelectionAddService service;
    private SelectedAllCoursesAndItsStudentsTableModel tableModel;

    public AdminSelectedCourseAddListener(AdminSelectedCourseAdd instance,SelectedAllCoursesAndStudents parentInstance) {
        this.instance = instance;
        this.parentInstance=parentInstance;
        service=new AdminCourseSelectionAddService();
        tableModel=new SelectedAllCoursesAndItsStudentsTableModel(parentInstance);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String stuID = instance.tfStudentID.getText();
        String courseID = instance.tfCourseID.getText();
        if (service.addCourseSelection(stuID,courseID)==1){
            instance.dispose();
            tableModel.fillData();
        }else {
            JOptionPane.showMessageDialog(instance,"add failed!");
        }
    }
}
