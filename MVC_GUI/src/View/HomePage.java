package View;

import javax.swing.*;

import Controller.Controller;
import UserModel.*;

public class HomePage extends JFrame
{
	JLabel lblWelcome; 
	
	public HomePage(Model UserModel)
	{
		
		lblWelcome=new JLabel("Welcome To Home");
		lblWelcome.setBounds(40,50,120,50);
		
		add(lblWelcome);
		
		setTitle("Welcome Window");
		setSize(300,300);
		setLayout(null);
		setVisible(true);
	}
}

