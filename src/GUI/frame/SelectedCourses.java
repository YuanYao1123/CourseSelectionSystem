package GUI.frame;

import GUI.listener.CourseSelectionActionListener;
import GUI.listener.CourseSelectionMouseListener;
import GUI.listener.SelectedCoursesActionListener;
import GUI.listener.SelectedCoursesMouseListener;
import GUI.model.CourseSelectionTableModel;
import GUI.model.SelectedCoursesTableModel;

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

public class SelectedCourses extends JFrame {

	private JPanel contentPane;
	public JTable courseSelectedTable;
	public JTextField tfSearch;
	public JButton btnDelete;
	public JLabel lblSort;
	public JButton btnRefresh;



	public static void main(String[] args) {
		SelectedCourses frame = new SelectedCourses();
	}

	public SelectedCourses() {
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1159, 759);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel lblNewLabel = new JLabel("YZ University");
		lblNewLabel.setForeground(new Color(188, 143, 143));
		lblNewLabel.setFont(new Font("SimSun", Font.BOLD, 28));

		JScrollPane scrollPane = new JScrollPane();

		tfSearch = new JTextField();
		tfSearch.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setFont(new Font("SimSun", Font.PLAIN, 22));
		lblNewLabel_1.setIcon(new ImageIcon(CourseSelection.class.getResource("/image/search.png")));

		lblSort= new JLabel("");
		lblSort.setIcon(new ImageIcon(CourseSelection.class.getResource("/image/sort.png")));


		btnDelete = new JButton("Delete");
		btnDelete.setFont(new Font("SimSun", Font.BOLD, 22));

		btnRefresh = new JButton("Refresh");
		btnRefresh.setForeground(new Color(102, 102, 153));
		btnRefresh.setFont(new Font("SimSun", Font.BOLD, 22));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
				gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
								.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
										.addGroup(gl_contentPane.createSequentialGroup()
												.addGap(37)
												.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
														.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 1088, Short.MAX_VALUE)
														.addGroup(gl_contentPane.createSequentialGroup()
																.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 213, GroupLayout.PREFERRED_SIZE)
																.addGap(69)
																.addComponent(lblNewLabel_1)
																.addPreferredGap(ComponentPlacement.RELATED)
																.addComponent(tfSearch, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
																.addGap(124)
																.addComponent(lblSort)
																.addPreferredGap(ComponentPlacement.UNRELATED)
																.addGap(77)
																.addComponent(btnRefresh, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE))))
										.addGroup(gl_contentPane.createSequentialGroup()
												.addContainerGap(1001, Short.MAX_VALUE)
												.addComponent(btnDelete, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)))
								.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
				gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
												.addGap(31)
												.addComponent(tfSearch, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_contentPane.createSequentialGroup()
												.addGap(22)
												.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
														.addComponent(lblNewLabel_1)
														.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)))
										.addGroup(gl_contentPane.createSequentialGroup()
												.addGap(31)
												.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
														.addComponent(lblSort)
														.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
																.addComponent(btnRefresh, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)))))
								.addGap(10)
								.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 577, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
								.addComponent(btnDelete, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
		);

		courseSelectedTable = new JTable();
		courseSelectedTable.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		courseSelectedTable.setRowHeight(26);
		courseSelectedTable.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
						"id", "Course Name", "Lecturer", "Grade"
				}
		) {
			boolean[] columnEditables = new boolean[] {
					false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		courseSelectedTable.getColumnModel().getColumn(0).setPreferredWidth(26);
		courseSelectedTable.getColumnModel().getColumn(1).setPreferredWidth(90);
		courseSelectedTable.getColumnModel().getColumn(2).setPreferredWidth(83);
		courseSelectedTable.setFont(new Font("SimSun", Font.PLAIN, 18));

		scrollPane.setViewportView(courseSelectedTable);
		contentPane.setLayout(gl_contentPane);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		new SelectedCoursesTableModel(this).fillData();
		SelectedCoursesActionListener selectedCoursesActionListener =new SelectedCoursesActionListener(this);
		SelectedCoursesMouseListener selectedCoursesMouseListener=new SelectedCoursesMouseListener(this);
		tfSearch.addActionListener(selectedCoursesActionListener);
		btnDelete.addActionListener(selectedCoursesActionListener);
		lblSort.addMouseListener(selectedCoursesMouseListener);
		btnRefresh.addActionListener(selectedCoursesActionListener);
	}
}
