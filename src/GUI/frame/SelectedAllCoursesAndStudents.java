package GUI.frame;

import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.ListSelectionModel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;

public class SelectedAllCoursesAndStudents extends JFrame {

	private JPanel contentPane;
	private JTable courseSelectedTable;
	public JTextField tfSearchCourse;
	public JButton btnAdd;
	public JButton btnModify;
	public JButton btnDelete;
	public JTextField tfSearchStudent;
	public JLabel lblSortByStu;
	public JLabel lblSortByCourse;

	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_4;


	public static void main(String[] args) {
		SelectedAllCoursesAndStudents frame = new SelectedAllCoursesAndStudents();
	}


	public SelectedAllCoursesAndStudents() {
		setResizable(false);
		setBounds(100, 100, 1370, 792);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel lblNewLabel = new JLabel("X University");
		lblNewLabel.setForeground(new Color(188, 143, 143));
		lblNewLabel.setFont(new Font("SimSun", Font.BOLD, 28));

		JScrollPane scrollPane = new JScrollPane();

		tfSearchCourse = new JTextField();
		tfSearchCourse.setColumns(10);

		lblSortByCourse = new JLabel("");
		lblSortByCourse.setIcon(new ImageIcon(CourseSelection.class.getResource("/image/sort.png")));

		btnAdd = new JButton("Add");
		btnAdd.setFont(new Font("SimSun", Font.BOLD, 22));

		btnModify = new JButton("Modify");
		btnModify.setFont(new Font("SimSun", Font.BOLD, 22));

		btnDelete = new JButton("Delete");
		btnDelete.setFont(new Font("SimSun", Font.BOLD, 22));

		tfSearchStudent = new JTextField();
		tfSearchStudent.setColumns(10);

		lblNewLabel_1 = new JLabel("Course Name:");
		lblNewLabel_1.setFont(new Font("SimSun", Font.PLAIN, 16));

		lblNewLabel_3 = new JLabel("Student Name:");
		lblNewLabel_3.setFont(new Font("SimSun", Font.PLAIN, 16));

		lblNewLabel_2 = new JLabel("Course Sort");
		lblNewLabel_2.setFont(new Font("SimSun", Font.PLAIN, 16));

		lblNewLabel_4 = new JLabel("Student Sort");
		lblNewLabel_4.setFont(new Font("SimSun", Font.PLAIN, 16));

		lblSortByStu = new JLabel("");
		lblSortByStu.setIcon(new ImageIcon(SelectedAllCoursesAndStudents.class.getResource("/image/sort.png")));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
				gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
								.addGap(37)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
												.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 1299, Short.MAX_VALUE)
												.addContainerGap())
										.addGroup(gl_contentPane.createSequentialGroup()
												.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 201, GroupLayout.PREFERRED_SIZE)
												.addGap(71)
												.addComponent(lblNewLabel_1)
												.addGap(18)
												.addComponent(tfSearchCourse, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
												.addGap(47)
												.addComponent(lblNewLabel_3)
												.addGap(18)
												.addComponent(tfSearchStudent, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
												.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
														.addGroup(gl_contentPane.createSequentialGroup()
																.addGap(41)
																.addComponent(lblSortByCourse)
																.addPreferredGap(ComponentPlacement.RELATED, 34, GroupLayout.PREFERRED_SIZE))
														.addComponent(lblNewLabel_2, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE))
												.addGap(59)
												.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
														.addComponent(lblNewLabel_4)
														.addGroup(gl_contentPane.createSequentialGroup()
																.addGap(28)
																.addComponent(lblSortByStu, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)))
												.addGap(182))))
						.addGroup(gl_contentPane.createSequentialGroup()
								.addContainerGap(883, Short.MAX_VALUE)
								.addComponent(btnAdd, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
								.addGap(36)
								.addComponent(btnModify, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
								.addGap(37)
								.addComponent(btnDelete, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
								.addGap(37))
		);
		gl_contentPane.setVerticalGroup(
				gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
								.addContainerGap()
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
												.addGap(2)
												.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
														.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
														.addComponent(tfSearchStudent, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
														.addComponent(lblNewLabel_3)
														.addComponent(tfSearchCourse, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
														.addComponent(lblNewLabel_1)))
										.addGroup(gl_contentPane.createSequentialGroup()
												.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(lblSortByStu, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_contentPane.createSequentialGroup()
												.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(lblSortByCourse)))
								.addGap(18)
								.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 577, GroupLayout.PREFERRED_SIZE)
								.addGap(30)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(btnAdd, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
												.addComponent(btnDelete, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
												.addComponent(btnModify, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)))
								.addContainerGap(18, Short.MAX_VALUE))
		);

		courseSelectedTable = new JTable();
		courseSelectedTable.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		courseSelectedTable.setRowHeight(26);
		courseSelectedTable.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
						"StudentID", "Student Name", "Course ID", "Course Name", "Lecturer", "Type", "Capacity"
				}
		) {
			boolean[] columnEditables = new boolean[] {
					false, false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		courseSelectedTable.getColumnModel().getColumn(0).setPreferredWidth(71);
		courseSelectedTable.getColumnModel().getColumn(1).setPreferredWidth(84);
		courseSelectedTable.getColumnModel().getColumn(3).setPreferredWidth(90);
		courseSelectedTable.getColumnModel().getColumn(4).setPreferredWidth(83);
		courseSelectedTable.setFont(new Font("SimSun", Font.PLAIN, 18));

		scrollPane.setViewportView(courseSelectedTable);
		contentPane.setLayout(gl_contentPane);

		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setVisible(true);

	}
}
