package GUI.listener;

import GUI.frame.SelectedAllCoursesAndStudents;
import GUI.model.SelectedAllCoursesAndItsStudentsTableModel;
import service.SelectedAllCoursesAndStudentsService;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;

public class SelectedAllCoursesAndItsStudentsMouseListener implements MouseListener {
    private SelectedAllCoursesAndStudents instance;
    private SelectedAllCoursesAndStudentsService service;

    private SelectedAllCoursesAndItsStudentsTableModel tableModel;
    private JTable table;
    private DefaultTableModel modelGUI;

    public SelectedAllCoursesAndItsStudentsMouseListener(SelectedAllCoursesAndStudents instance) {
        this.instance = instance;
        service =new SelectedAllCoursesAndStudentsService();
        tableModel=new SelectedAllCoursesAndItsStudentsTableModel(instance);
        table=instance.courseSelectedTable;
        modelGUI=(DefaultTableModel) table.getModel();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        JLabel label=(JLabel) e.getSource();
        if (label==instance.lblSortByCourse){
            tableModel.fillData(service.getCourseListSortedByCourseName());
        } else if (label == instance.lblSortByStu) {
            tableModel.fillData(service.getCourseListSortedByStudentName());
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
