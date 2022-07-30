package GUI.listener;

import GUI.frame.CourseAdd;
import GUI.frame.CourseManagement;
import GUI.frame.CourseModify;
import GUI.model.CourseManagementModel;
import service.AdminCourseAddService;
import service.AdminCourseModifyService;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CourseModifyActionListener implements ActionListener {
    private CourseModify instance;
    private AdminCourseModifyService service;
    private CourseManagement parentInstance;
    private CourseManagementModel tableModel;

    public CourseModifyActionListener(CourseModify instance,CourseManagement parentInstance) {
        this.parentInstance=parentInstance;
        this.instance = instance;
        service=new AdminCourseModifyService();
        tableModel=new CourseManagementModel(parentInstance);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String ID = instance.tfID.getText();
        String courseName = instance.tfCourseName.getText();
        int capacity = Integer.parseInt(instance.tfCapacity.getText());
        String lecture = instance.tfLecture.getText();
        String type = (String) instance.cbType.getSelectedItem();
        if (service.modify(ID,courseName,capacity,type,lecture)==1){
            instance.dispose();
            tableModel.fillData();
        }else {
            JOptionPane.showMessageDialog(instance,"modifying failed!");
        }
    }
}

