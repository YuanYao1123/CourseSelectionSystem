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

public class StudentModify extends JFrame {

	private JPanel contentPane;
	public JTextField tfStudentID;
	public JTextField tfName;
	public JTextField tfGender;
	public JTextField tfAge;
	public JTextField tfCountry;
	public JTextField tfMajor;
	public JTextField tfIntake;
	public JTextField tfSemester;
	public JTextField tfGraduateYear;
	
	private JLabel lblNewLabel_1;
	private JButton btnModify;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		new StudentModify();
	}

	/**
	 * Create the frame.
	 */
	public StudentModify() {
		setResizable(false);
		setBounds(100, 100, 648, 823);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Student ID");
		lblNewLabel.setFont(new Font("SimSun", Font.BOLD, 22));
		
		tfStudentID = new JTextField();
		tfStudentID.setColumns(10);
		
		JLabel lblCourseName = new JLabel("Name");
		lblCourseName.setFont(new Font("SimSun", Font.BOLD, 22));
		
		JLabel lblNewLabel_2 = new JLabel("Gender");
		lblNewLabel_2.setFont(new Font("SimSun", Font.BOLD, 22));
		
		JLabel lblNewLabel_3 = new JLabel("Age");
		lblNewLabel_3.setFont(new Font("SimSun", Font.BOLD, 22));
		
		JLabel lblNewLabel_4 = new JLabel("Country");
		lblNewLabel_4.setFont(new Font("SimSun", Font.BOLD, 22));
		
		tfName = new JTextField();
		tfName.setColumns(10);
		
		tfGender = new JTextField();
		tfGender.setColumns(10);
		
		tfAge = new JTextField();
		tfAge.setColumns(10);
		
		tfCountry = new JTextField();
		tfCountry.setColumns(10);
		
		lblNewLabel_1 = new JLabel("Modify Student");
		lblNewLabel_1.setFont(new Font("SimSun", Font.BOLD, 28));
		
		btnModify = new JButton("Modify");
		btnModify.setFont(new Font("SimSun", Font.BOLD, 22));
		
		lblNewLabel_5 = new JLabel("Major");
		lblNewLabel_5.setFont(new Font("SimSun", Font.BOLD, 22));
		
		lblNewLabel_6 = new JLabel("Intake");
		lblNewLabel_6.setFont(new Font("SimSun", Font.BOLD, 22));
		
		lblNewLabel_7 = new JLabel("Semester");
		lblNewLabel_7.setFont(new Font("SimSun", Font.BOLD, 22));
		
		lblNewLabel_8 = new JLabel("Gradu Year");
		lblNewLabel_8.setFont(new Font("SimSun", Font.BOLD, 22));
		
		tfMajor = new JTextField();
		tfMajor.setColumns(10);
		
		tfIntake = new JTextField();
		tfIntake.setColumns(10);
		
		tfSemester = new JTextField();
		tfSemester.setColumns(10);
		
		tfGraduateYear = new JTextField();
		tfGraduateYear.setColumns(10);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(24)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(lblNewLabel_2)
								.addComponent(lblCourseName)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblNewLabel)
										.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel_4)
										.addComponent(lblNewLabel_6, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel_8, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel_7, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel_5, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)))
							.addGap(68)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(tfGraduateYear, GroupLayout.PREFERRED_SIZE, 349, GroupLayout.PREFERRED_SIZE)
								.addComponent(tfSemester, GroupLayout.PREFERRED_SIZE, 349, GroupLayout.PREFERRED_SIZE)
								.addComponent(tfIntake, GroupLayout.PREFERRED_SIZE, 349, GroupLayout.PREFERRED_SIZE)
								.addComponent(tfMajor, GroupLayout.PREFERRED_SIZE, 349, GroupLayout.PREFERRED_SIZE)
								.addComponent(tfGender, GroupLayout.PREFERRED_SIZE, 349, GroupLayout.PREFERRED_SIZE)
								.addComponent(tfName, GroupLayout.PREFERRED_SIZE, 349, GroupLayout.PREFERRED_SIZE)
								.addComponent(tfStudentID, GroupLayout.PREFERRED_SIZE, 349, GroupLayout.PREFERRED_SIZE)
								.addComponent(tfAge, GroupLayout.PREFERRED_SIZE, 349, GroupLayout.PREFERRED_SIZE)
								.addComponent(tfCountry, GroupLayout.PREFERRED_SIZE, 349, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnModify)))
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
										.addComponent(tfName, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblCourseName, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(65)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(tfStudentID, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))))
							.addGap(27)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
								.addComponent(tfGender, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
							.addGap(19)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(tfAge, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
							.addGap(19)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
								.addComponent(tfCountry, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(30)
							.addComponent(lblNewLabel_1)))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(19)
							.addComponent(lblNewLabel_5, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(lblNewLabel_6, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(lblNewLabel_7, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(18)
							.addComponent(tfMajor, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(tfIntake, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(tfSemester, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblNewLabel_8, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
						.addComponent(tfGraduateYear, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
					.addComponent(btnModify)
					.addGap(22))
		);
		contentPane.setLayout(gl_contentPane);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

}
