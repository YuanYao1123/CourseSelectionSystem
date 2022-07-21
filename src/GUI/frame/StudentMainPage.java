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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		StudentMainPage frame = new StudentMainPage();
	}

	public static StudentMainPage getInstance() {
		return new StudentMainPage();
	}

	/**
	 * Create the frame.
	 */
	private StudentMainPage() {
		setResizable(false);
		setBounds(100, 100, 1054, 569);
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
					.addGap(52)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addComponent(lbCourseSelection, GroupLayout.PREFERRED_SIZE, 216, GroupLayout.PREFERRED_SIZE)
							.addGap(56)
							.addComponent(lbFeedback))
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblCourseSelection, GroupLayout.PREFERRED_SIZE, 336, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
							.addComponent(lblFeedback, GroupLayout.PREFERRED_SIZE, 198, GroupLayout.PREFERRED_SIZE)))
					.addGap(85))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(20)
					.addComponent(lblNewLabel_2)
					.addPreferredGap(ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
					.addComponent(lbWelcome, GroupLayout.PREFERRED_SIZE, 405, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2)
						.addComponent(lbWelcome, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addComponent(lbFeedback)
							.addGap(92))
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addComponent(lbCourseSelection, GroupLayout.PREFERRED_SIZE, 232, GroupLayout.PREFERRED_SIZE)
							.addGap(66))
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addComponent(lbProfile, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE)
							.addGap(82)))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(lblCourseSelection, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblFeedback, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
					.addGap(85))
		);
		contentPane.setLayout(gl_contentPane);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
