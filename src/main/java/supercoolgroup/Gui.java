package supercoolgroup;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JRadioButton;
import java.awt.*;
import java.awt.event.*;

public class Gui extends JFrame{
	
	JLabel la1, la2, la3, la4;
	JTextField t1, t2;
	JCheckBox ch1;
	JButton b1,b2,b3;
	JRadioButton rb1, rb2, rb3;
	ButtonGroup bg1;
	
	public static void main(String[] args) {
		
		Gui frame = new Gui();
		frame.setVisible(true);

				
	}
public Gui() {
	
	// Window
	setLayout(null);
	//getContentPane().setBackground(Color.GRAY);
	setSize(800, 300);
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
	add(la1);
	
	// First TextBox 
	t1 = new JTextField("");
	t1.setBounds(200, 70, 400, 20);
	add(t1);
	
	// Second Label
	la2 = new JLabel("Search File :");
	la2.setOpaque(true);
	la2.setFont(new Font("Serif", Font.PLAIN, 18));
	la2.setBounds(100, 62, 100, 30);
	la2.setForeground(Color.BLACK);
	add(la2);
	
	//Third Label
	la3 = new JLabel("Files indexed : 0");
	la3.setOpaque(true);
	la3.setFont(new Font("Serif", Font.BOLD, 13));
	la3.setBounds(335, 125, 100, 30);
	la3.setForeground(Color.BLACK);
	add(la3);
	
	// Search Button
	b1 = new JButton("Search");
	b1.setBounds(200, 120, 100, 30);
	add(b1);
	
	//About Button
	b2 = new JButton("About us");
	b2.setBounds(20, 250, 100, 20);
	add(b2);
	b2.addActionListener(new Action());
	
	// Maintenance Button
	b3 = new JButton("Maintenance");
	b3.setBounds(470, 120, 130, 30);
	add(b3);
	b3.addActionListener(new action2());
	
	rb1 = new JRadioButton("All of the search terms", true);
	rb1.setBounds(610, 62, 200, 20);
	add(rb1);
	
	rb2 = new JRadioButton("Any of the search terms");
	rb2.setBounds(610, 80, 200, 30);
	add(rb2);
	
	rb3 = new JRadioButton("Exact Phrase");
	rb3.setBounds(610, 102, 200, 30);
	add(rb3);
	
	// Radio Group
	bg1 = new ButtonGroup();
	bg1.add(rb1);
	bg1.add(rb2);
	bg1.add(rb3);		
}
	
}

