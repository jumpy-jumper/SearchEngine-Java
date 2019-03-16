package supercoolgroup;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

// Querying action.
public class ActionQuery implements ActionListener {

	ActionMaintenance maintWindow; // a reference to the maint window this instance is spawned from.

	ActionQuery (ActionMaintenance maintWindow)
	{
		this.maintWindow = maintWindow;
	}
	/**
	 * @wbp.parser.entryPoint
	 */
	public void actionPerformed(ActionEvent arg0) {
		JFrame window = new JFrame();
		window.setTitle("File Query");
		window.setVisible(true);
		window.getContentPane().setLayout(null);
		window.setSize(600, 400);
		window.setResizable(false);
		window.setLocationRelativeTo(null);
		
		JLabel name = new JLabel("CURRENT FILE: " + maintWindow.currentFile.getName());
		name.setOpaque(true);
		name.setFont(new Font("Serif", Font.BOLD, 20));
		name.setBounds(50, 10, 500, 30);
		name.setForeground(Color.BLACK);
		window.getContentPane().add(name);

		// Add any specific queries below, in the form of buttons.

		JButton b1 = new JButton("File Path");
		b1.setBounds(60, 60, 100, 20);
		window.getContentPane().add(b1);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SwingUtilities.invokeLater( new Runnable(){
					public void run () {
						JFrame window = new JFrame();
						window.setTitle("Query Information");
						window.setVisible(true);
						window.getContentPane().setLayout(null);
						window.setSize(600, 100);
						window.setResizable(true);
						window.setLocationRelativeTo(null);

						JLabel text = new JLabel( maintWindow.currentFile.getAbsolutePath());
						text.setOpaque(true);
						text.setFont(new Font("Serif", Font.PLAIN, 20));
						text.setBounds(10, 10, 580, 30);
						text.setForeground(Color.BLACK);
						window.getContentPane().add(text);
					}
				});
			}
		});
	}
}
