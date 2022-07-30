package GUI.listener;

import GUI.frame.CourseAdd;
import GUI.frame.CourseManagement;
import GUI.model.CourseManagementModel;
import service.AdminCourseAddService;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CourseAddActionListener implements ActionListener {
    private CourseAdd instance;
    private CourseManagement parentInstance;
    private AdminCourseAddService service;
    private CourseManagementModel tableModel;

    public CourseAddActionListener(CourseAdd instance,CourseManagement parentInstance) {
        this.instance = instance;
        this.parentInstance=parentInstance;
        service=new AdminCourseAddService();
        tableModel=new CourseManagementModel(parentInstance);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String ID = instance.tfID.getText();
        String courseName = instance.tfCourseName.getText();
        int capacity = Integer.parseInt(instance.tfCapacity.getText());
        String lecture = instance.tfLecture.getText();
        String type = (String) instance.cbType.getSelectedItem();
        if (service.addCourse(ID,courseName,capacity,type,lecture)==1){
            instance.dispose();
            tableModel.fillData();
        }else {
            JOptionPane.showMessageDialog(instance,"add failed!");
        }
    }
}
