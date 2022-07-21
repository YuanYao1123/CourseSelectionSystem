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

public class AdminMainPage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		new AdminMainPage();
	}

	public static AdminMainPage getInstance() {
		return new AdminMainPage();
	}

	/**
	 * Create the frame.
	 */
	private AdminMainPage() {
		setResizable(false);
		setBounds(100, 100, 1339, 757);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel lblFeedback = new JLabel("Course Management");
		lblFeedback.setFont(new Font("SimSun", Font.BOLD, 37));

		JLabel lbCourseSelectionAdmin = new JLabel("");

//		lbCourseSelection.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent e) {
//			}
//		});
		lbCourseSelectionAdmin.setIcon(new ImageIcon(StudentMainPage.class.getResource("/image/courseselection.png")));

		JLabel lbFeedbackAdmin = new JLabel("");
//		lbFeedback.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent e) {
//			}
//		});
		lbFeedbackAdmin.setIcon(new ImageIcon(StudentMainPage.class.getResource("/image/feedback.png")));

		JLabel lblNewLabel_2 = new JLabel("XUniversity Course Selection System\r\n");
		lblNewLabel_2.setForeground(SystemColor.activeCaption);
		lblNewLabel_2.setFont(new Font("SimSun", Font.BOLD, 24));

		JLabel lbWelcomeAdmin = new JLabel("Welcome you: admin xxx");
		lbWelcomeAdmin.setForeground(SystemColor.activeCaption);
		lbWelcomeAdmin.setFont(new Font("SimSun", Font.BOLD, 24));



		JLabel lblReceivedFeedback = new JLabel("Received Feedback");
		lblReceivedFeedback.setFont(new Font("SimSun", Font.BOLD, 37));

		JLabel lbCoursesSelectionInfo = new JLabel("");
		lbCoursesSelectionInfo.setIcon(new ImageIcon(AdminMainPage.class.getResource("/image/profile.png")));

		JLabel lblCourseselectioninfo = new JLabel("Courses Selection Info");
		lblCourseselectioninfo.setFont(new Font("SimSun", Font.BOLD, 37));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
				gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
								.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
										.addGroup(gl_contentPane.createSequentialGroup()
												.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
														.addGroup(gl_contentPane.createSequentialGroup()
																.addGap(20)
																.addComponent(lblNewLabel_2))
														.addGroup(gl_contentPane.createSequentialGroup()
																.addGap(106)
																.addComponent(lbCourseSelectionAdmin, GroupLayout.PREFERRED_SIZE, 195, GroupLayout.PREFERRED_SIZE)
																.addGap(200)
																.addComponent(lbCoursesSelectionInfo, GroupLayout.PREFERRED_SIZE, 225, GroupLayout.PREFERRED_SIZE)))
												.addGap(174))
										.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
												.addGap(31)
												.addComponent(lblFeedback)
												.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(lblCourseselectioninfo, GroupLayout.PREFERRED_SIZE, 465, GroupLayout.PREFERRED_SIZE)
												.addGap(18)))
								.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
										.addGroup(gl_contentPane.createSequentialGroup()
												.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
														.addGroup(gl_contentPane.createSequentialGroup()
																.addComponent(lbWelcomeAdmin, GroupLayout.PREFERRED_SIZE, 405, GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(ComponentPlacement.RELATED))
														.addGroup(gl_contentPane.createSequentialGroup()
																.addGap(26)
																.addComponent(lbFeedbackAdmin)))
												.addGap(10))
										.addGroup(gl_contentPane.createSequentialGroup()
												.addComponent(lblReceivedFeedback, GroupLayout.PREFERRED_SIZE, 382, GroupLayout.PREFERRED_SIZE)
												.addContainerGap())))
		);
		gl_contentPane.setVerticalGroup(
				gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
								.addContainerGap()
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblNewLabel_2)
										.addComponent(lbWelcomeAdmin, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
												.addGap(140)
												.addComponent(lbCourseSelectionAdmin, GroupLayout.PREFERRED_SIZE, 221, GroupLayout.PREFERRED_SIZE)
												.addGap(76))
										.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(lbFeedbackAdmin)
												.addGap(93))
										.addGroup(gl_contentPane.createSequentialGroup()
												.addGap(166)
												.addComponent(lbCoursesSelectionInfo, GroupLayout.PREFERRED_SIZE, 195, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)))
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblReceivedFeedback, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblFeedback, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblCourseselectioninfo, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
								.addGap(192))
		);
		contentPane.setLayout(gl_contentPane);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}