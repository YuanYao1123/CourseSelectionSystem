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
	public JTextField tfSearch;
	public JTextField tfSort;
	private JButton btnAdd;
	private JButton btnModify;
	private JButton btnDelete;


	public static void main(String[] args) {
		SelectedAllCoursesAndStudents frame = new SelectedAllCoursesAndStudents();
	}


	public SelectedAllCoursesAndStudents() {
		setResizable(false);
		setBounds(100, 100, 1158, 790);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel lblNewLabel = new JLabel("X University");
		lblNewLabel.setForeground(new Color(188, 143, 143));
		lblNewLabel.setFont(new Font("SimSun", Font.BOLD, 28));

		JScrollPane scrollPane = new JScrollPane();

		tfSearch = new JTextField();
		tfSearch.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setFont(new Font("SimSun", Font.PLAIN, 22));
		lblNewLabel_1.setIcon(new ImageIcon(CourseSelection.class.getResource("/image/search.png")));

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(CourseSelection.class.getResource("/image/sort.png")));

		tfSort = new JTextField();
		tfSort.setColumns(10);

		btnAdd = new JButton("Add");
		btnAdd.setFont(new Font("SimSun", Font.BOLD, 22));

		btnModify = new JButton("Modify");
		btnModify.setFont(new Font("SimSun", Font.BOLD, 22));

		btnDelete = new JButton("Delete");
		btnDelete.setFont(new Font("SimSun", Font.BOLD, 22));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
				gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
								.addGap(37)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 1086, Short.MAX_VALUE)
										.addGroup(gl_contentPane.createSequentialGroup()
												.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 201, GroupLayout.PREFERRED_SIZE)
												.addGap(69)
												.addComponent(lblNewLabel_1)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(tfSearch, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
												.addGap(124)
												.addComponent(lblNewLabel_2)
												.addPreferredGap(ComponentPlacement.UNRELATED)
												.addComponent(tfSort, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)))
								.addContainerGap())
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
								.addContainerGap(709, Short.MAX_VALUE)
								.addComponent(btnAdd, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
								.addGap(36)
								.addComponent(btnModify, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
								.addGap(37)
								.addComponent(btnDelete, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
								.addGap(37))
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
														.addComponent(lblNewLabel_2)
														.addComponent(tfSort, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
								.addGap(10)
								.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 577, GroupLayout.PREFERRED_SIZE)
								.addGap(30)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(btnAdd, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
												.addComponent(btnDelete, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
												.addComponent(btnModify, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)))
								.addContainerGap(35, Short.MAX_VALUE))
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
