package GUI.listener;



import GUI.frame.CourseSelection;
import GUI.model.CourseSelectionTableModel;
import model.Course;
import service.CourseSelectionService;
import service.LoginWindowService;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

public class CourseSelectionActionListener implements ActionListener {
    private CourseSelection courseSelection;
    private CourseSelectionService courseSelectionService;

    private CourseSelectionTableModel courseSelectionTableModel;

    public CourseSelectionActionListener(CourseSelection courseSelection) {
        this.courseSelection = courseSelection;
        courseSelectionService =new CourseSelectionService();
        courseSelectionTableModel=new CourseSelectionTableModel(courseSelection);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source instanceof JButton){
            JButton btn = (JButton) source;
            if (btn==courseSelection.btnSubmit){
                int[] selectedRows = courseSelection.courseInfoTable.getSelectedRows();
                ArrayList<model.CourseSelection> courseSelectionList=new ArrayList<>();
                for (int rowIndex:
                selectedRows){
                    model.CourseSelection courseSelectionBean=new model.CourseSelection();
                    courseSelectionBean.setCourseID((String) courseSelection.courseInfoTable.getValueAt(rowIndex,0));
                    courseSelectionBean.setStuID(LoginWindowService.userID);
                    courseSelectionList.add(courseSelectionBean);
                }
               if(courseSelectionService.addCourse(courseSelectionList)>0){
                   JOptionPane.showMessageDialog(courseSelection,"Adding courses succeeded!");
               }else {
                   JOptionPane.showMessageDialog(courseSelection,"Adding courses Failed.");
               }
//                JOptionPane.showMessageDialog(courseSelection,"too be built");
            } else if (btn==courseSelection.btnCancel) {
                courseSelection.dispose();
            }
        } else if (source instanceof JTextField) {
            JTextField tfSearch=(JTextField) source;
            String searchedName = courseSelection.tfSearch.getText();
            Course searchedObject = courseSelectionService.getSearchedObject(searchedName);
            if (searchedObject!=null) {
                courseSelectionTableModel.fillData(searchedObject);
            }else {
                JOptionPane.showMessageDialog(courseSelection,"cannot find this course name");
            }
        }
    }

}
