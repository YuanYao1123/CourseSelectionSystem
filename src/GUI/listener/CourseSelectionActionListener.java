package GUI.listener;



import GUI.frame.CourseSelection;
import GUI.model.CourseSelectionTableModel;
import model.Course;
import service.CourseSelectionService;
import service.LoginWindowService;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class CourseSelectionActionListener implements ActionListener {
    private CourseSelection instance;
    private CourseSelectionService courseSelectionService;

    private CourseSelectionTableModel courseSelectionTableModel;

    public CourseSelectionActionListener(CourseSelection instance) {
        this.instance = instance;
        courseSelectionService =new CourseSelectionService();
        courseSelectionTableModel=new CourseSelectionTableModel(instance);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source instanceof JButton){
            JButton btn = (JButton) source;
            if (btn== instance.btnSubmit){
                int[] selectedRows = instance.courseInfoTable.getSelectedRows();
                ArrayList<model.CourseSelection> courseSelectionList=new ArrayList<>();
                for (int rowIndex:
                selectedRows){
                    model.CourseSelection courseSelectionBean=new model.CourseSelection();
                    courseSelectionBean.setCourseID((String) instance.courseInfoTable.getValueAt(rowIndex,0));
                    courseSelectionBean.setStuID(LoginWindowService.userID);
                    courseSelectionList.add(courseSelectionBean);
                }
               if(courseSelectionService.addCourse(courseSelectionList)>0){
                   JOptionPane.showMessageDialog(instance,"Adding courses succeeded!");
                   for (int i=selectedRows.length-1;i>=0;i--) {
                       DefaultTableModel modelGUI = (DefaultTableModel) instance.courseInfoTable.getModel();
                       modelGUI.removeRow(selectedRows[i]);
                   }
               }else {
                   JOptionPane.showMessageDialog(instance,"Adding courses Failed.");
               }
//                JOptionPane.showMessageDialog(instance,"too be built");
            } else if (btn== instance.btnCancel) {
                instance.dispose();
            } else if (btn==instance.btnRefresh) {
                courseSelectionTableModel.fillData();
            }
        } else if (source instanceof JTextField) {
            JTextField tfSearch=(JTextField) source;
            String searchedName = instance.tfSearch.getText().trim();
            Course searchedObject = courseSelectionService.getSearchedObject(searchedName);
            if (searchedObject!=null) {
                courseSelectionTableModel.fillData(searchedObject);
            }else {
                JOptionPane.showMessageDialog(instance,"cannot find this course name");
            }
        }
    }

}
