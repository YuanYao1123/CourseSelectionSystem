package GUI.listener;

import GUI.frame.SelectedCourses;
import GUI.model.SelectedCoursesTableModel;
import service.SelectedCoursesService;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;

public class SelectedCoursesMouseListener implements MouseListener {
    private SelectedCourses instance;
    private SelectedCoursesService selectedCoursesService;

    private SelectedCoursesTableModel selectedCoursesTableModel;

    public SelectedCoursesMouseListener(SelectedCourses instance) {
        this.instance = instance;
        selectedCoursesService =new SelectedCoursesService();
        selectedCoursesTableModel =new SelectedCoursesTableModel(instance);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        Object source = e.getSource();
        JLabel lblSort = (JLabel)source;
        List<Object[]> courseListSortedByName = selectedCoursesService.getCourseListSortedByName();
        selectedCoursesTableModel.fillData(courseListSortedByName);
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
