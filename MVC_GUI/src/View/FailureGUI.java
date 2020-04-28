package View;

import javax.swing.*;

public class FailureGUI extends JFrame
{
	JLabel lblError;
	
	public FailureGUI() 
	{
		lblError= new JLabel("Inalid User Name and Password ");
		lblError.setBounds(20, 100, 150, 50);
		
		add(lblError);
		
		setTitle("Error");
		setSize(300,300);
		setLayout(null);
		setVisible(true);
	}
}
