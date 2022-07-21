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

public class CourseAdd extends JFrame {

	private JPanel contentPane;
	public JTextField tfID;
	public JTextField tfCourseName;
	public JTextField tfCapacity;
	public JTextField tfAvailability;
	public JTextField tfLecture;
	private JLabel lblNewLabel_1;
	private JButton btnSubmit;


	public static void main(String[] args) {
		new CourseAdd();
	}

	public static CourseAdd getInstance() {
		return new CourseAdd();
	}

	/**
	 * Create the frame.
	 */
	private CourseAdd() {
		setBounds(100, 100, 645, 634);
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
		
		JLabel lblNewLabel_3 = new JLabel("Avalability");
		lblNewLabel_3.setFont(new Font("SimSun", Font.BOLD, 22));
		
		JLabel lblNewLabel_4 = new JLabel("Lecture ");
		lblNewLabel_4.setFont(new Font("SimSun", Font.BOLD, 22));
		
		tfCourseName = new JTextField();
		tfCourseName.setColumns(10);
		
		tfCapacity = new JTextField();
		tfCapacity.setColumns(10);
		
		tfAvailability = new JTextField();
		tfAvailability.setColumns(10);
		
		tfLecture = new JTextField();
		tfLecture.setColumns(10);
		
		lblNewLabel_1 = new JLabel("Add  Course");
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
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblCourseName)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblNewLabel_2)
										.addComponent(lblNewLabel_3)
										.addComponent(lblNewLabel_4))
									.addPreferredGap(ComponentPlacement.RELATED)))
							.addGap(68)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(tfCourseName, GroupLayout.PREFERRED_SIZE, 349, GroupLayout.PREFERRED_SIZE)
								.addComponent(tfID, GroupLayout.PREFERRED_SIZE, 349, GroupLayout.PREFERRED_SIZE)
								.addComponent(tfCapacity, GroupLayout.PREFERRED_SIZE, 349, GroupLayout.PREFERRED_SIZE)
								.addComponent(tfAvailability, GroupLayout.PREFERRED_SIZE, 349, GroupLayout.PREFERRED_SIZE)
								.addComponent(tfLecture, GroupLayout.PREFERRED_SIZE, 349, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnSubmit)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(208)
							.addComponent(lblNewLabel_1)))
					.addContainerGap(73, Short.MAX_VALUE))
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
							.addGap(60)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(tfCapacity, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
							.addGap(19)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(tfAvailability, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
							.addGap(19)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
								.addComponent(tfLecture, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(30)
							.addComponent(lblNewLabel_1)))
					.addPreferredGap(ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
					.addComponent(btnSubmit)
					.addGap(22))
		);
		contentPane.setLayout(gl_contentPane);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}

}
