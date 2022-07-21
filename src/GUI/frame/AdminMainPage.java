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
		
		JLabel lblNewLabel = new JLabel("Students");
		lblNewLabel.setFont(new Font("SimSun", Font.BOLD, 37));
		
		JLabel lbStudnetInfo = new JLabel("");
//		lbProfile.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent e) {
//			}
//		});
		lbStudnetInfo.setIcon(new ImageIcon(StudentMainPage.class.getResource("/image/profile.png")));
		
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
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(20)
					.addComponent(lblNewLabel_2)
					.addPreferredGap(ComponentPlacement.RELATED, 436, Short.MAX_VALUE)
					.addComponent(lbWelcomeAdmin, GroupLayout.PREFERRED_SIZE, 405, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(70)
							.addComponent(lblNewLabel))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(38)
							.addComponent(lbStudnetInfo, GroupLayout.PREFERRED_SIZE, 216, GroupLayout.PREFERRED_SIZE)))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(232)
							.addComponent(lbCourseSelectionAdmin, GroupLayout.PREFERRED_SIZE, 195, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 160, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblFeedback)
							.addGap(102)))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lbFeedbackAdmin)
						.addComponent(lblReceivedFeedback, GroupLayout.PREFERRED_SIZE, 382, GroupLayout.PREFERRED_SIZE))
					.addGap(92))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2)
						.addComponent(lbWelcomeAdmin, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
					.addGap(158)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lbStudnetInfo, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE)
							.addGap(76))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(lbFeedbackAdmin)
								.addComponent(lbCourseSelectionAdmin, GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE))
							.addGap(84)))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(lblReceivedFeedback, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblFeedback, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
					.addGap(192))
		);
		contentPane.setLayout(gl_contentPane);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
