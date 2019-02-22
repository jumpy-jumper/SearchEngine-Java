package supercoolgroup;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class action2 implements ActionListener {


	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JFrame window = new JFrame();
		window.setTitle("Maintenance");
		window.setVisible(true);
		window.setLayout(null);
		window.setSize(600, 400);
		window.setResizable(false);
		window.setLocationRelativeTo(null);
		
		JLabel name = new JLabel("The name of files :");
		name.setOpaque(true);
		name.setFont(new Font("Serif", Font.BOLD, 20));
		name.setBounds(50, 10, 200, 30);
		name.setForeground(Color.BLACK);
		window.add(name);
		
		JLabel indexed = new JLabel("Number of files indexed : 0");
		indexed.setOpaque(true);
		indexed.setFont(new Font("Serif", Font.BOLD, 14));
		indexed.setBounds(50, 180, 200, 20);
		indexed.setForeground(Color.BLACK);
		window.add(indexed);
		
		JList list = new JList();
		list.setBounds(250, 20, 300, 300);
		window.add(list);

        //JTextField field = new JTextField();
		//field.setBounds(250, 20, 300, 300);
		//window.add(field);
		
		JButton b1 = new JButton("Adding"); 
		b1.setBounds(60, 50, 100, 20);
		window.add(b1);
		
		JButton b2 = new JButton("Removing"); 
		b2.setBounds(60, 80, 100, 20);
		window.add(b2);
		
		JButton b3 = new JButton("Updating"); 
		b3.setBounds(60, 110, 100, 20);
		window.add(b3);
	}

}
