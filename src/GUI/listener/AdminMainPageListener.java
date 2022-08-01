package GUI.listener;

import GUI.frame.*;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class AdminMainPageListener implements MouseListener {
    private AdminMainPage instance;

    public AdminMainPageListener(AdminMainPage instance) {
        this.instance = instance;
    }


    @Override
    public void mouseClicked(MouseEvent e) {
        JLabel label=(JLabel)e.getSource();
        if(label==instance.lbCourseSelectionAdmin){
            new CourseManagement();
        } else if (label==instance.lbCoursesSelectionInfo) {
            new SelectedAllCoursesAndStudents();
        }
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
