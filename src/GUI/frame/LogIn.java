package GUI.frame;

import GUI.listener.LogInListener;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Component;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Rectangle;

import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;

public class LogIn extends JFrame {

	private JPanel contentPane;
	public JTextField tfUserName;
	public JPasswordField tfPassword;
	public JRadioButton rdbtnStudent;
	public JRadioButton rdbtnAdmin;
	private JButton btnLogIn;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;


	public static void main(String[] args) {
		new LogIn();
	}


	private LogIn() {
		setResizable(false);
		setTitle("Log In");
		setBounds(100, 100, 748, 530);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("XUniversity Course Selection System");
		lblNewLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblNewLabel.setFont(new Font("SimSun", Font.BOLD, 27));
		
		JLabel lblNewLabel_1 = new JLabel("LogIn");
		lblNewLabel_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("SimSun", Font.BOLD, 24));
		
		tfUserName = new JTextField();
		tfUserName.setToolTipText("input the user name");
		tfUserName.setFont(new Font("SimSun", Font.PLAIN, 22));
		tfUserName.setColumns(10);
		
		btnLogIn = new JButton("LogIn");
		btnLogIn.setFont(new Font("SimSun", Font.BOLD, 22));
		btnLogIn.addActionListener(new LogInListener(this));   //add listener and pass the current object into the Listener
		
		tfPassword = new JPasswordField();
		tfPassword.setFont(new Font("SimSun", Font.PLAIN, 22));
		
		lblNewLabel_2 = new JLabel("User Name:");
		lblNewLabel_2.setFont(new Font("SimSun", Font.PLAIN, 24));
		
		lblNewLabel_3 = new JLabel("Password:");
		lblNewLabel_3.setFont(new Font("SimSun", Font.PLAIN, 24));
		
		lblNewLabel_4 = new JLabel("Role:");
		lblNewLabel_4.setFont(new Font("SimSun", Font.PLAIN, 24));
		
		rdbtnStudent = new JRadioButton("Student");
		rdbtnStudent.setFont(new Font("SimSun", Font.PLAIN, 24));
		
		rdbtnAdmin = new JRadioButton("Admin");
		rdbtnAdmin.setFont(new Font("SimSun", Font.PLAIN, 24));
		ButtonGroup bg=new ButtonGroup();
		bg.add(rdbtnAdmin);
		bg.add(rdbtnStudent);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 724, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(273)
					.addComponent(btnLogIn, GroupLayout.PREFERRED_SIZE, 182, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(269, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(291)
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(301, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap(128, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblNewLabel_4)
						.addComponent(lblNewLabel_2)
						.addComponent(lblNewLabel_3))
					.addGap(35)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
							.addComponent(tfPassword, Alignment.LEADING)
							.addComponent(tfUserName, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(rdbtnStudent)
							.addGap(44)
							.addComponent(rdbtnAdmin)))
					.addGap(96))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(1)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
					.addGap(26)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(tfUserName, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_2))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(tfPassword, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_3))
					.addGap(26)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_4)
						.addComponent(rdbtnStudent)
						.addComponent(rdbtnAdmin))
					.addGap(58)
					.addComponent(btnLogIn, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
					.addGap(32))
		);
		contentPane.setLayout(gl_contentPane);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
}
