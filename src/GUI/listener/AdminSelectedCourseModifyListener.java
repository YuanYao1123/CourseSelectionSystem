package GUI.listener;

import GUI.frame.AdminSelectedCourseAdd;
import GUI.frame.AdminSelectedCourseModify;
import GUI.frame.SelectedAllCoursesAndStudents;
import GUI.model.SelectedAllCoursesAndItsStudentsTableModel;
import service.AdminCourseSelectionAddService;
import service.AdminCourseSelectionModifyService;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminSelectedCourseModifyListener implements ActionListener {
    private AdminSelectedCourseModify instance;
    private AdminCourseSelectionModifyService service;
    private SelectedAllCoursesAndStudents parentInstance;
    private SelectedAllCoursesAndItsStudentsTableModel tableModel;
    private String oldCourseID;

    public AdminSelectedCourseModifyListener(AdminSelectedCourseModify instance,SelectedAllCoursesAndStudents parentInstance,String oldCourseID) {
        this.instance = instance;
        this.parentInstance=parentInstance;
        service=new AdminCourseSelectionModifyService();
        tableModel=new SelectedAllCoursesAndItsStudentsTableModel(parentInstance);
        this.oldCourseID=oldCourseID;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String stuID = instance.tfStudentID.getText();
        String courseID = instance.tfCourseID.getText();
        if (service.modifyCourseSelection(oldCourseID,stuID,courseID)==1){
            instance.dispose();
            tableModel.fillData();
        }else {
            JOptionPane.showMessageDialog(instance,"modifying failed!");
        }
    }
}
