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
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;
import java.awt.SystemColor;
import java.awt.ScrollPane;
import java.awt.Panel;

public class action2 implements ActionListener {
	private JTable table;


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
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				 SwingUtilities.invokeLater( new Runnable(){
				 public void run () {
					 JFileChooser fileChooser = new JFileChooser( "." );         
					 int status = fileChooser.showOpenDialog( null );         
					 if ( status == JFileChooser.APPROVE_OPTION ){ 
						 File selectedFile = fileChooser.getSelectedFile(); 
						 System.out.println( "Selected: "+ selectedFile.getParent()+ " --- "+ selectedFile.getName() );   
						 }            
					 }     
				 }); 
			}
		});
		window.getContentPane().add(b1);
		
		JButton b2 = new JButton("Removing"); 
		b2.setBounds(60, 80, 100, 20);
		window.getContentPane().add(b2);
		
		JButton b3 = new JButton("Updating"); 
		b3.setBounds(60, 110, 100, 20);
		window.getContentPane().add(b3);
		
		// Test table
		Object[][] data = {{"sdf","asdasd","asd"}};
		String [] title = {"File name", "Status", "Size"};
		
		JTable table = new JTable(data, title);
		
		JScrollPane scrollpane= new JScrollPane(table);
		scrollpane.setBounds(267, 22, 303, 326);
		window.getContentPane().add(scrollpane);
		
		
		
	}
}
