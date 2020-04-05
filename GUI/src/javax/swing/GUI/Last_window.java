package javax.swing.GUI;

import javax.swing.*;

public class Last_window extends JFrame
{
	JLabel lblWelcome; 
	public Last_window()
	{
		lblWelcome=new JLabel("Welcome");
		lblWelcome.setBounds(150,150,150,150);
		add(lblWelcome);
		
		setTitle("Welcome Window");
		setSize(300,300);
		setVisible(true);
	}
}
