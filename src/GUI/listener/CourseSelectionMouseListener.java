package GUI.listener;

import GUI.frame.CourseSelection;
import GUI.model.CourseSelectionTableModel;
import model.Course;
import service.CourseSelectionService;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;

public class CourseSelectionMouseListener implements MouseListener {
    private CourseSelection instance;
    private CourseSelectionService courseSelectionService;

    private CourseSelectionTableModel courseSelectionTableModel;

    public CourseSelectionMouseListener(CourseSelection instance) {
        this.instance = instance;
        courseSelectionService =new CourseSelectionService();
        courseSelectionTableModel=new CourseSelectionTableModel(instance);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        Object source = e.getSource();
        JLabel lblSort = (JLabel)source;
        List<Course> courseListSortedByName = courseSelectionService.getCourseListSortedByName();
        courseSelectionTableModel.fillData(courseListSortedByName);
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
