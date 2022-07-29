package GUI.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;

import GUI.frame.AdminMainPage;
import GUI.frame.LogIn;
import GUI.frame.StudentMainPage;
import service.LoginWindowService;

import javax.swing.*;

public class LogInListener implements ActionListener{
	private LogIn instance;

	public LogInListener() {
	}

	public LogInListener(LogIn instance) {
		this.instance = instance;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String username=instance.tfUserName.getText();
		String password=instance.tfPassword.getText();
		LoginWindowService loginWindowService = new LoginWindowService();
		if (instance.rdbtnStudent.isSelected()){
			if (!loginWindowService.login(username,password,1)){
				JOptionPane.showMessageDialog(instance,"Wrong account or password");
			} else {
				instance.dispose();
				StudentMainPage studentMainPage = new StudentMainPage();
				studentMainPage.lbWelcome.setText("Welcome you: "+loginWindowService.userID);
			}
		} else if (instance.rdbtnAdmin.isSelected()) {
			if (!loginWindowService.login(username,password,0)){
				JOptionPane.showMessageDialog(instance,"Wrong account or password");
			} else {
				instance.dispose();
				AdminMainPage adminMainPage = new AdminMainPage();
				adminMainPage.lbWelcomeAdmin.setText("Welcome you: "+loginWindowService.userID);
			}
		}


	}

}
