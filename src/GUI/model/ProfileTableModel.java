package GUI.model;

import GUI.frame.Profile;
import service.LoginWindowService;
import service.ProfileService;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProfileTableModel {
    private Profile instance;

    public ProfileTableModel(Profile instance) {
        this.instance = instance;
    }

    public void fillData() {
        ProfileService profileService = new ProfileService();
        ArrayList<String[]> arrays = profileService.searchStudentAsPairs(LoginWindowService.userID);
        if (arrays==null) {
            JOptionPane.showMessageDialog(instance, "connecting to database failed");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) instance.profileTable.getModel();
        for (String[] rowData:
        arrays){
            model.addRow(rowData);
        }
    }
}
