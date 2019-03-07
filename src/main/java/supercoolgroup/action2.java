package supercoolgroup;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.filechooser.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;
import java.awt.SystemColor;

public class action2 implements ActionListener {
	private JTable table;
	private JTable table_1;


	/**
	 * @wbp.parser.entryPoint
	 */
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JFrame window = new JFrame();
		window.setTitle("Maintenance");
		window.setVisible(true);
		window.getContentPane().setLayout(null);
		window.setSize(600, 400);
		window.setResizable(false);
		window.setLocationRelativeTo(null);
		
		JLabel name = new JLabel("The name of files :");
		name.setOpaque(true);
		name.setFont(new Font("Serif", Font.BOLD, 20));
		name.setBounds(50, 10, 200, 30);
		name.setForeground(Color.BLACK);
		window.getContentPane().add(name);
		
		JLabel indexed = new JLabel("Number of files indexed : 0");
		indexed.setOpaque(true);
		indexed.setFont(new Font("Serif", Font.BOLD, 14));
		indexed.setBounds(50, 180, 200, 20);
		indexed.setForeground(Color.BLACK);
		window.getContentPane().add(indexed);

		JButton b1 = new JButton("Adding"); 
		b1.setBounds(60, 50, 100, 20);
		window.getContentPane().add(b1);
		//b3.addActionListener(new action2());
		b1.addActionListener(new adding());
		
		JButton b2 = new JButton("Removing"); 
		b2.setBounds(60, 80, 100, 20);
		window.getContentPane().add(b2);
		
		JButton b3 = new JButton("Updating"); 
		b3.setBounds(60, 110, 100, 20);
		window.getContentPane().add(b3);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(283, 10, 301, 337);
		window.getContentPane().add(scrollPane);
			
		table_1 = new JTable();
		table_1.setColumnSelectionAllowed(true);
		table_1.setFillsViewportHeight(true);
		table_1.setBackground(SystemColor.menu);
		table_1.setForeground(SystemColor.inactiveCaptionBorder);
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"File Name", "Size", "Status"
			}
		) {
			/**
			 * 
			 */
			private static final long serialVersionUID = -2042854964742736177L;
			boolean[] columnEditables = new boolean[] {
				false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table_1.getColumnModel().getColumn(0).setResizable(false);
		table_1.getColumnModel().getColumn(1).setResizable(false);
		table_1.getColumnModel().getColumn(2).setResizable(false);
		scrollPane.setViewportView(table_1);
		
		
		

		
	}
}
