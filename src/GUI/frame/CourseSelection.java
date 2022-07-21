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

public class CourseSelection extends JFrame {

	private JPanel contentPane;
	private JTable courseInfoTable;
	private JTextField tfSearch;
	private JTextField tfSort;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		new CourseSelection();
	}

	public static CourseSelection getInstance() {
		return new CourseSelection();
	}

	/**
	 * Create the frame.
	 */
	public CourseSelection() {
		setResizable(false);
		setBounds(100, 100, 1157, 738);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("X University");
		lblNewLabel.setForeground(new Color(188, 143, 143));
		lblNewLabel.setFont(new Font("SimSun", Font.BOLD, 28));
		
		JScrollPane scrollPane = new JScrollPane();
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setFont(new Font("SimSun", Font.BOLD, 22));
		
		JButton btnNewButton_1 = new JButton("Submit");
		btnNewButton_1.setFont(new Font("SimSun", Font.BOLD, 22));
		
		tfSearch = new JTextField();
		tfSearch.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setFont(new Font("SimSun", Font.PLAIN, 22));
		lblNewLabel_1.setIcon(new ImageIcon(CourseSelection.class.getResource("/image/search.png")));
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(CourseSelection.class.getResource("/image/sort.png")));
		
		tfSort = new JTextField();
		tfSort.setColumns(10);
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
							.addComponent(btnCancel)
							.addGap(93)
							.addComponent(btnNewButton_1)
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
						.addComponent(btnCancel)
						.addComponent(btnNewButton_1))
					.addGap(26))
		);
		
		courseInfoTable = new JTable();
		courseInfoTable.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		courseInfoTable.setRowHeight(26);
		courseInfoTable.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"id", "Course Name", "Capacity", "Availability", "Lecturer"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, true, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		courseInfoTable.getColumnModel().getColumn(0).setPreferredWidth(26);
		courseInfoTable.getColumnModel().getColumn(1).setPreferredWidth(90);
		courseInfoTable.getColumnModel().getColumn(2).setPreferredWidth(88);
		courseInfoTable.getColumnModel().getColumn(3).setPreferredWidth(98);
		courseInfoTable.getColumnModel().getColumn(4).setPreferredWidth(83);
		courseInfoTable.setFont(new Font("SimSun", Font.PLAIN, 18));

		scrollPane.setViewportView(courseInfoTable);
		contentPane.setLayout(gl_contentPane);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
