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

// Querying action.
public class ActionQuery implements ActionListener {
	private File currentFile;

	ActionQuery(File currentFile)
	{
		this.currentFile = currentFile;
	}

	/**
	 * @wbp.parser.entryPoint
	 */
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JFrame window = new JFrame();
		window.setTitle("File Query");
		window.setVisible(true);
		window.getContentPane().setLayout(null);
		window.setSize(600, 400);
		window.setResizable(false);
		window.setLocationRelativeTo(null);
		
		JLabel name = new JLabel("CURRENT FILE: " + currentFile.getName());
		name.setOpaque(true);
		name.setFont(new Font("Serif", Font.BOLD, 20));
		name.setBounds(50, 10, 200, 30);
		name.setForeground(Color.BLACK);
		window.getContentPane().add(name);

		JButton b1 = new JButton("File Path");
		b1.setBounds(60, 110, 100, 20);
		window.getContentPane().add(b1);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SwingUtilities.invokeLater( new Runnable(){
					public void run () {
						JFrame window = new JFrame();
						window.setTitle("Query Information");
						window.setVisible(true);
						window.getContentPane().setLayout(null);
						window.setSize(200, 100);
						window.setResizable(false);
						window.setLocationRelativeTo(null);

						JLabel text = new JLabel( currentFile.getName());
						text.setOpaque(true);
						text.setFont(new Font("Serif", Font.PLAIN, 20));
						text.setBounds(50, 10, 200, 30);
						text.setForeground(Color.BLACK);
						window.getContentPane().add(text);
					}
				});
			}
		});
	}
}
