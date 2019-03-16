package supercoolgroup;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.filechooser.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;
import java.awt.SystemColor;
import java.awt.ScrollPane;
import java.awt.Panel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class action2 implements ActionListener {
	private JTable table;
	File currentFile;

	/**
	 * @wbp.parser.entryPoint
	 */
	public void actionPerformed(ActionEvent arg0) {
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

		JButton b1 = new JButton("Add"); 
		b1.setBounds(60, 50, 100, 20);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 SwingUtilities.invokeLater( new Runnable(){
				 public void run () {
					 JFileChooser fileChooser = new JFileChooser( "." );         
					 int status = fileChooser.showOpenDialog( null );         
					 if ( status == JFileChooser.APPROVE_OPTION ){ 
						 currentFile = fileChooser.getSelectedFile();
						 //System.out.println( "Selected: "+ selectedFile.getParent()+ " --- "+ selectedFile.getName() );   
						 DefaultTableModel model = (DefaultTableModel)table.getModel();
						 model.addRow(new Object [] {currentFile.getParentFile(), "File Selected"});
						 }            
					 }     
				 }); 
			}
		});
		window.getContentPane().add(b1);
		
		JButton b2 = new JButton("Remove"); 
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				
				try {
					int selectedRowIndex = table.getSelectedRow();
					model.removeRow(selectedRowIndex);
				}catch(Exception ex)
				{
					JOptionPane.showMessageDialog(null, ex);
				}
				
			}
		});
		b2.setBounds(60, 80, 100, 20);
		window.getContentPane().add(b2);
		
		JButton b3 = new JButton("Update"); 
		b3.setBounds(60, 110, 100, 20);
		window.getContentPane().add(b3);

		JButton b4 = new JButton("Query");
		b4.setBounds(60, 140, 100, 20);
		window.getContentPane().add(b4);
		b4.addActionListener(new ActionQuery(this));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(271, 11, 301, 322);
		window.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"File name", "Status"
			}
		));
		scrollPane.setViewportView(table);
		
		
	}
}
