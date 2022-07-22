package GUI.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

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
		try {
			if (instance.rdbtnStudent.isSelected()){
				boolean flag=loginWindowService.login(username,password);
				if (!flag){
					JOptionPane.showMessageDialog(instance,"Wrong account or password");
				} else {
					instance.dispose();
					StudentMainPage studentMainPage = new StudentMainPage();
					studentMainPage.lbWelcome.setText("Welcome you: "+loginWindowService.getUsername());
				}
			} else if (instance.rdbtnAdmin.isSelected()) {

			}
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(instance,"connecting to database failed");
		}

	}

}
