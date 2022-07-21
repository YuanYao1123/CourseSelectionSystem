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
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class CourseModify extends JFrame {

	private JPanel contentPane;
	public JTextField tfID;
	public JTextField tfCourseName;
	public JTextField tfCapacity;
	public JTextField tfLecture;
	public JComboBox cbType;
	private JLabel lblNewLabel_1;
	private JButton btnSubmit;


	public static void main(String[] args) {
		new CourseModify();
	}

	public static CourseModify getInstance() {
		return new CourseModify();
	}

	/**
	 * Create the frame.
	 */
	private CourseModify() {
		setBounds(100, 100, 645, 642);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setFont(new Font("SimSun", Font.BOLD, 22));

		tfID = new JTextField();
		tfID.setColumns(10);

		JLabel lblCourseName = new JLabel("Course Name");
		lblCourseName.setFont(new Font("SimSun", Font.BOLD, 22));

		JLabel lblNewLabel_2 = new JLabel("Capacity");
		lblNewLabel_2.setFont(new Font("SimSun", Font.BOLD, 22));

		JLabel lblNewLabel_3 = new JLabel("Type");
		lblNewLabel_3.setFont(new Font("SimSun", Font.BOLD, 22));

		JLabel lblNewLabel_4 = new JLabel("Lecture ");
		lblNewLabel_4.setFont(new Font("SimSun", Font.BOLD, 22));

		tfCourseName = new JTextField();
		tfCourseName.setColumns(10);

		tfCapacity = new JTextField();
		tfCapacity.setColumns(10);

		tfLecture = new JTextField();
		tfLecture.setColumns(10);

		lblNewLabel_1 = new JLabel("Modify  Course");
		lblNewLabel_1.setFont(new Font("SimSun", Font.BOLD, 28));

		btnSubmit = new JButton("Submit");
		btnSubmit.setFont(new Font("SimSun", Font.BOLD, 22));

		cbType = new JComboBox();
		cbType.setFont(new Font("SimSun", Font.BOLD, 22));
		cbType.setModel(new DefaultComboBoxModel(new String[] {"Public Compulsory Course", "Specialized Course", "Optional Course "}));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
				gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
												.addGap(36)
												.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
														.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
														.addComponent(lblCourseName)
														.addGroup(gl_contentPane.createSequentialGroup()
																.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
																		.addComponent(lblNewLabel_3)
																		.addComponent(lblNewLabel_4))
																.addPreferredGap(ComponentPlacement.RELATED))
														.addComponent(lblNewLabel_2))
												.addGap(68)
												.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
														.addComponent(tfCapacity, GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
														.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
																.addComponent(tfCourseName, GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
																.addComponent(tfID, GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
																.addComponent(tfLecture, GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
																.addComponent(cbType, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
																.addComponent(btnSubmit))))
										.addGroup(gl_contentPane.createSequentialGroup()
												.addGap(208)
												.addComponent(lblNewLabel_1)))
								.addContainerGap(36, Short.MAX_VALUE))
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
																		.addComponent(tfCourseName, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
																		.addComponent(lblCourseName, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)))
														.addGroup(gl_contentPane.createSequentialGroup()
																.addGap(65)
																.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
																		.addComponent(tfID, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
																		.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))))
												.addGap(18)
												.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
														.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
														.addComponent(tfCapacity, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
												.addGap(19)
												.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
														.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
														.addComponent(cbType, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
												.addGap(19)
												.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
														.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
														.addComponent(tfLecture, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)))
										.addGroup(gl_contentPane.createSequentialGroup()
												.addGap(30)
												.addComponent(lblNewLabel_1)))
								.addPreferredGap(ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
								.addComponent(btnSubmit)
								.addGap(78))
		);
		contentPane.setLayout(gl_contentPane);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}

}
