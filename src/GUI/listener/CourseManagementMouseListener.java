package GUI.listener;

import GUI.frame.CourseManagement;
import GUI.model.CourseManagementModel;
import model.Course;
import service.CourseManagementService;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;

public class CourseManagementMouseListener implements MouseListener {
    private CourseManagement instance;
    private CourseManagementService service;
    private CourseManagementModel model;

    public CourseManagementMouseListener(CourseManagement instance) {
        this.instance = instance;
        this.service = new CourseManagementService();
        model=new CourseManagementModel(instance);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        Object source = e.getSource();
        JLabel lblSort = (JLabel)source;
        List<Course> courseListSortedByName = service.getCourseListSortedByCourseName();
        model.fillData(courseListSortedByName);
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
