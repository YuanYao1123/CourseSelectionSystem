package GUI.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import GUI.frame.LogIn;

public class LogInListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		LogIn logIn= LogIn.getInstance();
		String username=logIn.tfUserName.getText();
		String passwordString=logIn.tfPassword.getText();
		
	}
	
}
