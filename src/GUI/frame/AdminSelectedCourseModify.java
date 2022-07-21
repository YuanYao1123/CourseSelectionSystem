package GUI.frame;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import javax.swing.JButton;

public class AdminSelectedCourseModify extends JFrame {

	private JPanel contentPane;
	public JTextField tfStudentID;
	public JTextField tfCourseID;
	
	private JLabel lblNewLabel_1;
	private JButton btnSubmit;
	private static AdminSelectedCourseModify instance= new AdminSelectedCourseModify();
	public static void main(String[] args) {
		new AdminSelectedCourseModify();
	}
	
	public static AdminSelectedCourseModify getInstance() {
		return instance;
	}

	/**
	 * Create the frame.
	 */
	public AdminSelectedCourseModify() {
		setResizable(false);
		setBounds(100, 100, 635, 370);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Student ID");
		lblNewLabel.setFont(new Font("SimSun", Font.BOLD, 22));
		
		tfStudentID = new JTextField();
		tfStudentID.setColumns(10);
		
		JLabel lblCourseName = new JLabel("CourseID");
		lblCourseName.setFont(new Font("SimSun", Font.BOLD, 22));
		
		tfCourseID = new JTextField();
		tfCourseID.setColumns(10);
		
		lblNewLabel_1 = new JLabel("Modify Selection");
		lblNewLabel_1.setFont(new Font("SimSun", Font.BOLD, 28));
		
		btnSubmit = new JButton("Submit");
		btnSubmit.setFont(new Font("SimSun", Font.BOLD, 22));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(36)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(lblCourseName)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblNewLabel)
									.addPreferredGap(ComponentPlacement.RELATED)))
							.addGap(68)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(tfCourseID, GroupLayout.PREFERRED_SIZE, 349, GroupLayout.PREFERRED_SIZE)
								.addComponent(tfStudentID, GroupLayout.PREFERRED_SIZE, 349, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnSubmit)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(208)
							.addComponent(lblNewLabel_1)))
					.addContainerGap(51, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(51)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(138)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(tfCourseID, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblCourseName, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(65)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(tfStudentID, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(30)
							.addComponent(lblNewLabel_1)))
					.addPreferredGap(ComponentPlacement.RELATED, 656, Short.MAX_VALUE)
					.addComponent(btnSubmit)
					.addGap(22))
		);
		contentPane.setLayout(gl_contentPane);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

}
