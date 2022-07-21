package GUI.frame;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class StudentMainPage extends JFrame {

	private JPanel contentPane;
	private static StudentMainPage instance= new StudentMainPage();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		StudentMainPage frame = new StudentMainPage();
	}

	public static StudentMainPage getInstance() {
		return instance;
	}

	/**
	 * Create the frame.
	 */
	public StudentMainPage() {
		setResizable(false);
		setBounds(100, 100, 1403, 574);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel lblNewLabel = new JLabel("Profile");
		lblNewLabel.setFont(new Font("SimSun", Font.BOLD, 37));

		JLabel lbProfile = new JLabel("");
//		lbProfile.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent e) {
//			}
//		});
		lbProfile.setIcon(new ImageIcon(StudentMainPage.class.getResource("/image/profile.png")));

		JLabel lblCourseSelection = new JLabel("Course Selection");
		lblCourseSelection.setFont(new Font("SimSun", Font.BOLD, 37));

		JLabel lblFeedback = new JLabel("Feedback");
		lblFeedback.setFont(new Font("SimSun", Font.BOLD, 37));

		JLabel lbCourseSelection = new JLabel("");
//		lbCourseSelection.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent e) {
//			}
//		});
		lbCourseSelection.setIcon(new ImageIcon(StudentMainPage.class.getResource("/image/courseselection.png")));

		JLabel lbFeedback = new JLabel("");
//		lbFeedback.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent e) {
//			}
//		});
		lbFeedback.setIcon(new ImageIcon(StudentMainPage.class.getResource("/image/feedback.png")));

		JLabel lblNewLabel_2 = new JLabel("XUniversity Course Selection System\r\n");
		lblNewLabel_2.setForeground(SystemColor.activeCaption);
		lblNewLabel_2.setFont(new Font("SimSun", Font.BOLD, 24));

		JLabel lbWelcome = new JLabel("Welcome you xxx");
		lbWelcome.setForeground(SystemColor.activeCaption);
		lbWelcome.setFont(new Font("SimSun", Font.BOLD, 24));

		JLabel lbSelectedCourses = new JLabel("");
		lbSelectedCourses.setIcon(new ImageIcon(StudentMainPage.class.getResource("/image/courseselection.png")));

		JLabel lblSelectedCourses = new JLabel("Selected Courses");
		lblSelectedCourses.setFont(new Font("SimSun", Font.BOLD, 37));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
				gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
												.addGap(114)
												.addComponent(lblNewLabel))
										.addGroup(gl_contentPane.createSequentialGroup()
												.addGap(68)
												.addComponent(lbProfile, GroupLayout.PREFERRED_SIZE, 216, GroupLayout.PREFERRED_SIZE)))
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
												.addGap(97)
												.addComponent(lbCourseSelection, GroupLayout.PREFERRED_SIZE, 216, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_contentPane.createSequentialGroup()
												.addGap(34)
												.addComponent(lblCourseSelection, GroupLayout.PREFERRED_SIZE, 336, GroupLayout.PREFERRED_SIZE)))
								.addGap(18)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
												.addPreferredGap(ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
												.addComponent(lbSelectedCourses, GroupLayout.PREFERRED_SIZE, 216, GroupLayout.PREFERRED_SIZE)
												.addGap(106))
										.addGroup(gl_contentPane.createSequentialGroup()
												.addGap(18)
												.addComponent(lblSelectedCourses, GroupLayout.PREFERRED_SIZE, 336, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)))
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
												.addComponent(lbFeedback)
												.addGap(61))
										.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
												.addComponent(lblFeedback, GroupLayout.PREFERRED_SIZE, 198, GroupLayout.PREFERRED_SIZE)
												.addGap(89))))
						.addGroup(gl_contentPane.createSequentialGroup()
								.addGap(20)
								.addComponent(lblNewLabel_2)
								.addPreferredGap(ComponentPlacement.RELATED, 500, Short.MAX_VALUE)
								.addComponent(lbWelcome, GroupLayout.PREFERRED_SIZE, 405, GroupLayout.PREFERRED_SIZE)
								.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
				gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
								.addContainerGap()
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblNewLabel_2)
										.addComponent(lbWelcome, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
												.addPreferredGap(ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
												.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
														.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
																.addComponent(lbProfile, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE)
																.addGap(82))
														.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
																.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
																		.addComponent(lbSelectedCourses, GroupLayout.PREFERRED_SIZE, 232, GroupLayout.PREFERRED_SIZE)
																		.addComponent(lbCourseSelection, GroupLayout.PREFERRED_SIZE, 232, GroupLayout.PREFERRED_SIZE))
																.addGap(61))))
										.addGroup(gl_contentPane.createSequentialGroup()
												.addGap(87)
												.addComponent(lbFeedback)
												.addPreferredGap(ComponentPlacement.RELATED)))
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
												.addComponent(lblNewLabel)
												.addComponent(lblFeedback, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_contentPane.createSequentialGroup()
												.addPreferredGap(ComponentPlacement.RELATED)
												.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
														.addComponent(lblSelectedCourses, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
														.addComponent(lblCourseSelection, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))))
								.addGap(85))
		);
		contentPane.setLayout(gl_contentPane);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
