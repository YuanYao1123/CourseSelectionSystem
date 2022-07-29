package GUI.listener;

import GUI.frame.SelectedCourses;
import GUI.model.SelectedCoursesTableModel;
import service.SelectedCoursesService;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;

public class SelectedCoursesMouseListener implements MouseListener {
    private SelectedCourses selectedCourses;
    private SelectedCoursesService selectedCoursesService;

    private SelectedCoursesTableModel selectedCoursesTableModel;

    public SelectedCoursesMouseListener(SelectedCourses selectedCourses) {
        this.selectedCourses = selectedCourses;
        selectedCoursesService =new SelectedCoursesService();
        selectedCoursesTableModel =new SelectedCoursesTableModel(selectedCourses);
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
