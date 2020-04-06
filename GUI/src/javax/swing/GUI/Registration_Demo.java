package javax.swing.GUI;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.*;

public class Registration_Demo extends JFrame
{
	JTextField txtUser,txtEmail,txtContact,txtPass;
	JLabel lblName,lblContact,lblEmail,lblpass,lblGreet;
	JButton btnSubmit,btnCancel;
	
	public Registration_Demo()
	{
		lblName=new JLabel("Enter your name	: ");
		lblName.setBounds(10, 20, 160, 30);
		
		lblContact=new JLabel("Contact Details	: ");
		lblContact.setBounds(10,50,160,30);
		
		lblEmail=new JLabel("Enter your E-mail	: ");
		lblEmail.setBounds(10,80,160,30);
		
		lblpass=new JLabel("Enter Password	: ");
		lblpass.setBounds(10,110,160,30);
				
		txtUser=new JTextField();
		txtUser.setBounds(160, 30,110, 20);
		
		txtContact=new JTextField();
		txtContact.setBounds(160, 60, 110, 20);
		
		txtEmail=new JTextField();
		txtEmail.setBounds(160, 90, 110, 20);
		
		txtPass=new JTextField();
		txtPass.setBounds(160, 120, 110, 20);
		
		btnSubmit=new JButton("Submit");
		btnSubmit.setBounds(10,160,110, 20);

		btnSubmit.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				txtUser.setText("Ekta");
				txtContact.setText("90XXXXXXXX");
				txtEmail.setText("Ekta@gmail.com");
				txtPass.setText("pass123");
				
				setVisible(false);
				Logedin log=new Logedin();
			}
		});
		
		btnCancel=new JButton("Cancel");
		btnCancel.setBounds(130, 160, 110, 20);
		
		btnCancel.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				txtUser.setText(" ");
				txtContact.setText(" ");
				txtEmail.setText(" ");
				txtPass.setText(" ");
			}
		});
		
		add(lblName);
		add(txtUser);
		add(lblContact);
		add(txtContact);
		add(lblEmail);
		add(txtEmail);
		add(lblpass);
		add(txtPass);
		add(btnSubmit);
		add(btnCancel);
		
		setTitle("Log in");
		setSize(400,400);
		setLayout(null);
		setVisible(true);
	}
	public static void main(String[] args) 
	{
		Registration_Demo demo=new Registration_Demo();
	}

}
