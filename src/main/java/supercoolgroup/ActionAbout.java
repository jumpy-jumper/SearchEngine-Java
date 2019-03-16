package supercoolgroup;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class ActionAbout implements ActionListener {

	public void actionPerformed(ActionEvent arg0) {
		JFrame about = new JFrame();
		about.setTitle("About us");
		about.setVisible(true);
		about.setLayout(null);
		about.setSize(400, 200);
		about.setResizable(false);
		about.setLocationRelativeTo(null);
		
		JLabel name = new JLabel("Search Engine Version 1.0");
		name.setOpaque(true);
		name.setFont(new Font("Serif", Font.BOLD, 15));
		name.setBounds(50, 10, 300, 30);
		name.setForeground(Color.BLACK);
		about.add(name);
		
		JLabel name2 = new JLabel("Model Solution to COP-2805 Search Engine Project");
		name2.setOpaque(true);
		name2.setFont(new Font("Serif", Font.PLAIN, 14));
		name2.setBounds(50, 11, 300, 95);
		name2.setForeground(Color.BLACK);
		about.add(name2);
		
		JLabel name3 = new JLabel("Written By Super-Cool Group, Tampa FL, USA");
		name3.setOpaque(true);
		name3.setFont(new Font("Serif", Font.PLAIN, 13));
		name3.setBounds(50, 60, 300, 100);
		name3.setForeground(Color.BLACK);
		about.add(name3);
		
		
		
	}

}
