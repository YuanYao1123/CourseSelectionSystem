package GUI.frame;

import GUI.listener.AdminMainPageListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.SystemColor;

public class AdminMainPage extends JFrame {

	private JPanel contentPane;
	public JLabel lbCoursesSelectionInfo;
	public JLabel lbCourseSelectionAdmin;
	public JLabel lbWelcomeAdmin;

	public static void main(String[] args) {
		new AdminMainPage();
	}


	/**
	 * Create the frame.
	 */
	public AdminMainPage() {
		setResizable(false);
		setBounds(100, 100, 972, 601);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel lblFeedback = new JLabel("Course Management");
		lblFeedback.setFont(new Font("SimSun", Font.BOLD, 37));

		lbCourseSelectionAdmin = new JLabel("");

//		lbCourseSelection.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent e) {
//			}
//		});
		lbCourseSelectionAdmin.setIcon(new ImageIcon(StudentMainPage.class.getResource("/image/courseselection.png")));

		JLabel lblNewLabel_2 = new JLabel("YZ University Course Selection System\r\n");
		lblNewLabel_2.setForeground(SystemColor.activeCaption);
		lblNewLabel_2.setFont(new Font("SimSun", Font.BOLD, 26));

		lbWelcomeAdmin = new JLabel("Welcome you: admin xxx");
		lbWelcomeAdmin.setForeground(SystemColor.activeCaption);
		lbWelcomeAdmin.setFont(new Font("SimSun", Font.BOLD, 25));

		lbCoursesSelectionInfo = new JLabel("");
		lbCoursesSelectionInfo.setIcon(new ImageIcon(AdminMainPage.class.getResource("/image/profile.png")));

		JLabel lblCourseSelectionInfo = new JLabel("Courses Selection Info");
		lblCourseSelectionInfo.setFont(new Font("SimSun", Font.BOLD, 37));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
				gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
								.addGap(106)
								.addComponent(lbCourseSelectionAdmin, GroupLayout.PREFERRED_SIZE, 195, GroupLayout.PREFERRED_SIZE)
								.addGap(247)
								.addComponent(lbCoursesSelectionInfo, GroupLayout.PREFERRED_SIZE, 225, GroupLayout.PREFERRED_SIZE)
								.addGap(593))
						.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
								.addGap(31)
								.addComponent(lblFeedback)
								.addGap(84)
								.addComponent(lblCourseSelectionInfo, GroupLayout.PREFERRED_SIZE, 465, GroupLayout.PREFERRED_SIZE)
								.addContainerGap(450, Short.MAX_VALUE))
						.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
								.addGap(178)
								.addComponent(lblNewLabel_2)
								.addContainerGap(668, Short.MAX_VALUE))
						.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
								.addGap(310)
								.addComponent(lbWelcomeAdmin, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGap(619))
		);
		gl_contentPane.setVerticalGroup(
				gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
								.addGap(23)
								.addComponent(lblNewLabel_2)
								.addGap(50)
								.addComponent(lbWelcomeAdmin, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
								.addGap(49)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
										.addComponent(lbCourseSelectionAdmin, GroupLayout.PREFERRED_SIZE, 221, GroupLayout.PREFERRED_SIZE)
										.addComponent(lbCoursesSelectionInfo, GroupLayout.PREFERRED_SIZE, 195, GroupLayout.PREFERRED_SIZE))
								.addGap(76)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblFeedback, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblCourseSelectionInfo, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
								.addGap(192))
		);
		contentPane.setLayout(gl_contentPane);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		AdminMainPageListener adminMainPageListener=new AdminMainPageListener(this);
		lbCourseSelectionAdmin.addMouseListener(adminMainPageListener);
		lbCoursesSelectionInfo.addMouseListener(adminMainPageListener);
	}

}
