package GUI.listener;

import GUI.frame.*;
import GUI.model.CourseManagementModel;
import GUI.model.CourseSelectionTableModel;
import GUI.model.SelectedAllCoursesAndItsStudentsTableModel;
import model.Course;
import service.CourseManagementService;
import service.SelectedAllCoursesAndStudentsService;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CourseManagementActionListener implements ActionListener {
    private CourseManagement instance;
    private CourseManagementService service;

    private CourseManagementModel tableModel;
    private JTable table;
    private DefaultTableModel modelGUI;

    public CourseManagementActionListener(CourseManagement instance) {
        this.instance = instance;
        service =new CourseManagementService();
        tableModel=new CourseManagementModel(instance);
        table=instance.courseManagementTable;
        modelGUI=(DefaultTableModel) table.getModel();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source instanceof JButton){
            JButton btn = (JButton) source;
            if (btn== instance.btnAdd){
                new CourseAdd(instance);
            } else if (btn== instance.btnModify) {
                int[] selectedRow = table.getSelectedRows();
                if (selectedRow.length==1) {
                    CourseModify courseModify = new CourseModify(instance);
                    courseModify.tfID.setText((String) table.getValueAt(selectedRow[0], 0));
                    courseModify.tfCourseName.setText((String) table.getValueAt(selectedRow[0], 1));
                    courseModify.tfCapacity.setText((String) table.getValueAt(selectedRow[0], 2));
                    String selectedValue = table.getValueAt(selectedRow[0], 3).toString();
                    if (selectedValue.contains("Public Compulsory Course")){
                        courseModify.cbType.setSelectedIndex(0);
                    } else if (selectedValue.contains("Specialized Course")) {
                        courseModify.cbType.setSelectedIndex(1);
                    } else if (selectedValue.contains("Optional Course")) {
                        courseModify.cbType.setSelectedIndex(2);
                    }
                    courseModify.tfLecture.setText((String) table.getValueAt(selectedRow[0], 4));
                }else {
                    JOptionPane.showMessageDialog(instance,"Please select and only select one row!");
                }
            } else if (btn == instance.btnDelete) {
                int[] selectedRow = table.getSelectedRows();
                if (selectedRow.length==1) {
                    String courseID = (String) table.getValueAt(selectedRow[0], 0);
                    int i = JOptionPane.showConfirmDialog(instance, "Do you really wanna delete this?", "Delete", JOptionPane.YES_NO_OPTION);
                    if (i == JOptionPane.YES_OPTION) {
                        if (service.deleteCourse(courseID) > 0) {
                            modelGUI.removeRow(selectedRow[0]);
                        }else {
                            JOptionPane.showMessageDialog(instance,"deleting a row failed");
                        }
                    }
                }else {
                    JOptionPane.showMessageDialog(instance,"Please select and only select one row!");
                }
            } else if (btn==instance.btnRefresh) {
                tableModel.fillData();
            }
        } else if (source instanceof JTextField) {
            JTextField tf=(JTextField) source;
            if (tf==instance.tfSearch){
                String searchedName = instance.tfSearch.getText().trim();
                Course searchedObject = service.getSearchedObjectByCourseName(searchedName);
                if (searchedObject!=null) {
                    tableModel.fillData(searchedObject);
                }else {
                    JOptionPane.showMessageDialog(instance,"cannot find this course name");
                }
            }

        }
    }
}
