package GUI.listener;

import GUI.frame.CourseSelection;
import GUI.frame.Profile;
import GUI.frame.SelectedCourses;
import GUI.frame.StudentMainPage;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class StudentMainPageListener implements MouseListener {

    private StudentMainPage instance;

    public StudentMainPageListener() {
    }

    public StudentMainPageListener(StudentMainPage instance) {
        this.instance = instance;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        JLabel label=(JLabel)e.getSource();
        if(label==instance.lbProfile){
            new Profile();
        } else if (label==instance.lbCourseSelection) {
            new CourseSelection();
        } else if (label==instance.lbSelectedCourses) {
            new SelectedCourses();
        } else if (label==instance.lbFeedback) {
            JOptionPane.showMessageDialog(instance, "To Be Built");
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
