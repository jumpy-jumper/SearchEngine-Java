package supercoolgroup;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.RowFilter;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Gui extends JFrame{
	
	JLabel la1, la2, la4;
	JTextField t1, t2;
	JCheckBox ch1;
	JButton b2,b3;
	JRadioButton rb1, rb2, rb3;
	ButtonGroup bg1;

    DefaultTableModel model = null, dm; // empty table
    private JTable table;

	public static void main(String[] args) {

		Gui frame = new Gui();
		frame.setVisible(true);

				
	}

    public Gui() {
	
	// Window
	getContentPane().setLayout(null);
	//getContentPane().setBackground(Color.GRAY);
	setSize(800, 387);
	setTitle("Search Engine V1.0");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setResizable(false);
	setLocationRelativeTo(null);
	
	// First Label
	la1 = new JLabel("Search Engine Application");
	la1.setOpaque(true);
	la1.setFont(new Font("Serif", Font.BOLD, 25));
	la1.setBounds(100, 10, 400, 30);
	la1.setForeground(Color.BLACK);
	getContentPane().add(la1);
	
	// First TextBox 
	t1 = new JTextField("");
	t1.addKeyListener(new KeyAdapter() {
		@Override
		public void keyReleased(KeyEvent arg0) {
			DefaultTableModel table2 = (DefaultTableModel)table.getModel();
			String search = t1.getText();
			TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(table2);
			table.setRowSorter(tr);
			tr.setRowFilter(RowFilter.regexFilter(search));
			
			
		}
	});
	t1.setBounds(200, 70, 400, 20);
	getContentPane().add(t1);
	
	// Second Label
	la2 = new JLabel("Search File :");
	la2.setOpaque(true);
	la2.setFont(new Font("Serif", Font.PLAIN, 18));
	la2.setBounds(100, 62, 100, 30);
	la2.setForeground(Color.BLACK);
	getContentPane().add(la2);
	
	//About Button
	b2 = new JButton("About us");
	b2.setBounds(10, 327, 100, 20);
	getContentPane().add(b2);
	b2.addActionListener(new ActionAbout());

	// Maintenance Button
	b3 = new JButton("Maintenance");
	b3.setBounds(424, 120, 130, 30);
	getContentPane().add(b3);
	b3.addActionListener(new ActionMaintenance(this));
	
	rb1 = new JRadioButton("All of the search terms", true);
	rb1.setBounds(610, 62, 200, 20);
	getContentPane().add(rb1);
	
	rb2 = new JRadioButton("Any of the search terms");
	rb2.setBounds(610, 80, 200, 30);
	getContentPane().add(rb2);
	
	rb3 = new JRadioButton("Exact Phrase");
	rb3.setBounds(610, 102, 200, 30);
	getContentPane().add(rb3);
	
	// Radio Group
	bg1 = new ButtonGroup();
	bg1.add(rb1);
	bg1.add(rb2);
	bg1.add(rb3);
	
	JButton btnImportData = new JButton("Import data");
	btnImportData.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			String filePath = "C:\\Users\\tylernaja\\git\\COP2805C-SuperCoolGroup\\Assets\\FileList.txt";
			File file = new File(filePath);
			
			try {
				FileReader fr = new FileReader(file);
	            BufferedReader br = new BufferedReader(fr);
	            
	            DefaultTableModel model = (DefaultTableModel)table.getModel();
	            Object[] lines = br.lines().toArray();
	            
	            for(int i = 0; i < lines.length; i++){
	                String[] row = lines[i].toString().split(" ");
	                model.addRow(row);
	            } 
			}
	            catch (FileNotFoundException e) {
				
				e.printStackTrace();
			}
			
		}
	});
	btnImportData.setBounds(250, 120, 100, 30);
	getContentPane().add(btnImportData);
	
	JScrollPane scrollPane = new JScrollPane();
	scrollPane.setBounds(200, 161, 400, 150);
	getContentPane().add(scrollPane);
	
	table = new JTable();
	table.setModel(new DefaultTableModel(
		new Object[][] {
		},
		new String[] {
			"File name"
		}
	));
	scrollPane.setViewportView(table);
}
}

