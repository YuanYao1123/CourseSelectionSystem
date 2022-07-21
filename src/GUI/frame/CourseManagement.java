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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CourseManagement extends JFrame {

	private JPanel contentPane;
	private JTable courseManagementTable;
	public JTextField tfSearch;
	public JTextField tfSort;
	private static CourseManagement instance= new CourseManagement();

	public static void main(String[] args) {
		new CourseManagement();
	}

	public static CourseManagement getInstance() {
		return instance;
	}

	/**
	 * Create the frame.
	 */
	public CourseManagement() {
		setResizable(false);
		setBounds(100, 100, 1157, 738);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel lblNewLabel = new JLabel("X University");
		lblNewLabel.setForeground(new Color(188, 143, 143));
		lblNewLabel.setFont(new Font("SimSun", Font.BOLD, 28));

		JScrollPane scrollPane = new JScrollPane();

		JButton btnModify = new JButton("Modify");
		btnModify.setFont(new Font("SimSun", Font.BOLD, 22));

		JButton btnDelete = new JButton("Delete");
		btnDelete.setFont(new Font("SimSun", Font.BOLD, 22));

		tfSearch = new JTextField();
//		tfSearch.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//			}
//		});
		tfSearch.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setFont(new Font("SimSun", Font.PLAIN, 22));
		lblNewLabel_1.setIcon(new ImageIcon(CourseSelection.class.getResource("/image/search.png")));

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(CourseSelection.class.getResource("/image/sort.png")));

		tfSort = new JTextField();
//		tfSort.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//			}
//		});
		tfSort.setColumns(10);

		JButton btnAdd = new JButton("Add");
		btnAdd.setFont(new Font("SimSun", Font.BOLD, 22));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
				gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
								.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
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
																.addComponent(tfSort, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE))))
										.addGroup(gl_contentPane.createSequentialGroup()
												.addContainerGap()
												.addComponent(btnAdd, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
												.addGap(26)
												.addComponent(btnModify)
												.addGap(28)
												.addComponent(btnDelete)
												.addGap(13)))
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
														.addComponent(lblNewLabel_2)
														.addComponent(tfSort, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
								.addGap(10)
								.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 524, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(btnDelete)
										.addComponent(btnAdd, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
										.addComponent(btnModify))
								.addGap(26))
		);

		courseManagementTable = new JTable();
		courseManagementTable.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		courseManagementTable.setRowHeight(26);
		courseManagementTable.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
						"id", "Course Name", "Capacity", "Type", "Lecturer"
				}
		) {
			boolean[] columnEditables = new boolean[] {
					false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		courseManagementTable.getColumnModel().getColumn(0).setPreferredWidth(26);
		courseManagementTable.getColumnModel().getColumn(1).setPreferredWidth(90);
		courseManagementTable.getColumnModel().getColumn(2).setPreferredWidth(88);
		courseManagementTable.getColumnModel().getColumn(3).setPreferredWidth(98);
		courseManagementTable.getColumnModel().getColumn(4).setPreferredWidth(83);
		courseManagementTable.setFont(new Font("SimSun", Font.PLAIN, 18));

		scrollPane.setViewportView(courseManagementTable);
		contentPane.setLayout(gl_contentPane);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
