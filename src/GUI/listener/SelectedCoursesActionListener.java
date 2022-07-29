package GUI.listener;

import GUI.frame.SelectedCourses;
import GUI.model.SelectedCoursesTableModel;
import service.SelectedCoursesService;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectedCoursesActionListener implements ActionListener {
    private SelectedCourses selectedCourses;
    private SelectedCoursesService selectedCoursesService;
    private SelectedCoursesTableModel selectedCoursesTableModel;

    public SelectedCoursesActionListener(SelectedCourses selectedCourses) {
        this.selectedCourses = selectedCourses;
        selectedCoursesService =new SelectedCoursesService();
        selectedCoursesTableModel=new SelectedCoursesTableModel(selectedCourses);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source instanceof JTextField) {
            JTextField tfSearch=(JTextField) source;
            String searchedName = selectedCourses.tfSearch.getText();
            Object[] searchedObject = selectedCoursesService.getSearchedObject(searchedName);
            if (searchedObject!=null) {
                selectedCoursesTableModel.fillData(searchedObject);
            }else {
                JOptionPane.showMessageDialog(selectedCourses,"cannot find this course name");
            }
        }
    }
}
