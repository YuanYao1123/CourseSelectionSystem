package GUI.listener;

import GUI.frame.SelectedCourses;
import GUI.model.SelectedCoursesTableModel;
import model.CourseSelection;
import service.LoginWindowService;
import service.SelectedCoursesService;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class SelectedCoursesActionListener implements ActionListener {
    private SelectedCourses instance;
    private SelectedCoursesService selectedCoursesService;
    private SelectedCoursesTableModel selectedCoursesTableModel;

    public SelectedCoursesActionListener(SelectedCourses instance) {
        this.instance = instance;
        selectedCoursesService =new SelectedCoursesService();
        selectedCoursesTableModel=new SelectedCoursesTableModel(instance);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source instanceof JTextField) {
            JTextField tfSearch=(JTextField) source;
            String searchedName = instance.tfSearch.getText().trim();
            Object[] searchedObject = selectedCoursesService.getSearchedObject(searchedName);
            if (searchedObject!=null) {
                selectedCoursesTableModel.fillData(searchedObject);
            }else {
                JOptionPane.showMessageDialog(instance,"cannot find this course name");
            }
        } else if (source instanceof JButton) {
            if ((JButton)source==instance.btnDelete) {
                JButton btnDelete = (JButton) source;
                int[] selectedRows = instance.courseSelectedTable.getSelectedRows();
                ArrayList<CourseSelection> courseSelectionList = new ArrayList<>();
                for (int rowIndex :
                        selectedRows) {
                    CourseSelection courseSelectionBean = new CourseSelection();
                    courseSelectionBean.setCourseID((String) instance.courseSelectedTable.getValueAt(rowIndex, 0));
                    courseSelectionBean.setStuID(LoginWindowService.userID);
                    courseSelectionList.add(courseSelectionBean);
                }
                int i = JOptionPane.showConfirmDialog(instance, "Do you really wanna delete?", "Delete", JOptionPane.YES_NO_OPTION);
                if (i == JOptionPane.YES_OPTION) {
                    if (selectedCoursesService.deleteSelectedCourseSelection(courseSelectionList) == 1) {
                        for (int j = selectedRows.length - 1; j >= 0; j--) {
                            DefaultTableModel modelGUI = (DefaultTableModel) instance.courseSelectedTable.getModel();
                            modelGUI.removeRow(selectedRows[j]);
                        }
                    }
                }
            } else if ((JButton) source == instance.btnRefresh) {
                selectedCoursesTableModel.fillData();
            }

        }
    }
}
