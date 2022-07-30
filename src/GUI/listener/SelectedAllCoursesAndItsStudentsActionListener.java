package GUI.listener;

import GUI.frame.AdminSelectedCourseAdd;
import GUI.frame.AdminSelectedCourseModify;
import GUI.frame.SelectedAllCoursesAndStudents;
import GUI.model.SelectedAllCoursesAndItsStudentsTableModel;
import service.SelectedAllCoursesAndStudentsService;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class SelectedAllCoursesAndItsStudentsActionListener implements ActionListener {
    private SelectedAllCoursesAndStudents instance;
    private SelectedAllCoursesAndStudentsService service;

    private SelectedAllCoursesAndItsStudentsTableModel tableModel;
    private JTable table;
    private DefaultTableModel modelGUI;

    public SelectedAllCoursesAndItsStudentsActionListener(SelectedAllCoursesAndStudents instance) {
        this.instance = instance;
        service =new SelectedAllCoursesAndStudentsService();
        tableModel=new SelectedAllCoursesAndItsStudentsTableModel(instance);
        table=instance.courseSelectedTable;
        modelGUI=(DefaultTableModel) table.getModel();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source instanceof JButton){
            JButton btn = (JButton) source;
            if (btn== instance.btnAdd){
               new AdminSelectedCourseAdd(instance);
            } else if (btn== instance.btnModify) {
                int selectedRow = table.getSelectedRow();
                if (selectedRow>=0) {
                    String studentID = (String) table.getValueAt(selectedRow, 0);
                    String oldCourseID = (String) table.getValueAt(selectedRow, 2);
                    AdminSelectedCourseModify adminSelectedCourseModify = new AdminSelectedCourseModify(instance,oldCourseID);
                    adminSelectedCourseModify.tfStudentID.setText(studentID);
                    adminSelectedCourseModify.tfCourseID.setText(oldCourseID);
                }else {
                    JOptionPane.showMessageDialog(instance,"Please select a row first!");
                }
            } else if (btn == instance.btnDelete) {
                int selectedRow = table.getSelectedRow();
                String stuID = (String)table.getValueAt(selectedRow, 0);
                String courseID = (String)table.getValueAt(selectedRow, 2);
                int i = JOptionPane.showConfirmDialog(instance, "Do you really wanna delete this?","Delete",JOptionPane.YES_NO_OPTION);
                if (i==JOptionPane.YES_OPTION) {
                    if (service.deleteSelectedCourseSelection(stuID, courseID) > 0) {
                        modelGUI.removeRow(selectedRow);
                    }
                }
            } else if (btn==instance.btnRefresh) {
                tableModel.fillData();
            }
        } else if (source instanceof JTextField) {
            JTextField tf=(JTextField) source;
            if (tf==instance.tfSearchCourse){
                String searchedName = instance.tfSearchCourse.getText().trim();
                List<Object[]> searchedObjectList = service.getSearchedObjectByCourseName(searchedName);
                if (searchedObjectList !=null) {
                    tableModel.fillData(searchedObjectList);
                }else {
                    JOptionPane.showMessageDialog(instance,"cannot find this course name");
                }
            } else if (tf==instance.tfSearchStudent) {
                String searchedName = instance.tfSearchStudent.getText().trim();
                List<Object[]> searchedObjectList = service.getSearchedObjectByStudentName(searchedName);
                if (searchedObjectList.size()>0) {
                    tableModel.fillData(searchedObjectList);
                }else {
                    JOptionPane.showMessageDialog(instance, "cannot find this student name");
                }
            }

        }
    }
}
