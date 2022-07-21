package GUI.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import GUI.frame.LogIn;
import GUI.frame.StudentMainPage;
import service.LoginWindowService;

import javax.swing.*;

public class LogInListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		LogIn logIn= LogIn.getInstance();
		String username=logIn.tfUserName.getText();
		String password=logIn.tfPassword.getText();
		LoginWindowService loginWindowService = new LoginWindowService();
		try {
			if (logIn.rdbtnStudent.isSelected()){
				boolean flag=loginWindowService.login(username,password);
				if (!flag){
					JOptionPane.showMessageDialog(logIn,"Wrong account or password");
				} else {
					logIn.dispose();
					StudentMainPage.getInstance();
				}
			} else if (logIn.rdbtnAdmin.isSelected()) {

			}
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(logIn,"connecting to database failed");
		}

	}
	
}
