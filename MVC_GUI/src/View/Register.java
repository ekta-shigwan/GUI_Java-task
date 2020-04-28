package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import Controller.Controller;
import UserModel.Model;

public class Register extends JFrame {
	JTextField txtuserName,txtemail,txtcontact,txtuserPwd;
	JLabel lbluserName,lblcontact,lblemail,lbluserPwd;
	JButton btnSubmit,btnReset;
	
	Controller Controller;
	Model  mdl;
	
	public Register()
	{
		Controller=new Controller();
		
		lbluserName=new JLabel("Enter your name	: ");
		lbluserName.setBounds(10, 20, 160, 30);
		
		txtuserName=new JTextField();
		txtuserName.setBounds(160, 30,110, 20);
		
		lblcontact=new JLabel("Contact Details	: ");
		lblcontact.setBounds(10,50,160,30);
		
		lblemail=new JLabel("Enter your E-mail	: ");
		lblemail.setBounds(10,80,160,30);
		
		lbluserPwd=new JLabel("Enter Password	: ");
		lbluserPwd.setBounds(10,110,160,30);
		
		txtcontact=new JTextField();
		txtcontact.setBounds(160, 60, 110, 20);
		
		txtemail=new JTextField();
		txtemail.setBounds(160, 90, 110, 20);
		
		txtuserPwd=new JTextField();
		txtuserPwd.setBounds(160, 120, 110, 20);
		
		btnSubmit=new JButton("Submit");
		btnSubmit.setBounds(10,160,110, 20);

		btnSubmit.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				String name=txtuserName.getText();
				String pass=txtuserPwd.getText();
				String mail=txtemail.getText();
				String contact=txtcontact.getText();
				
				mdl=new Model(name,pass,mail,contact);
				boolean Valid=Controller.registerUser(mdl);
				if(Valid)
				{
					LoginPage login=new LoginPage(mdl);
					setVisible(false);
					login.setVisible(true);
				}
				else
				{
					 txtemail.setText("Invalid email");
				}
			}
		});
		
		btnReset=new JButton("Reset");
		btnReset.setBounds(130, 160, 110, 20);
		
		btnReset.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				txtuserName.setText(" ");
				txtcontact.setText(" ");
				txtemail.setText(" ");
				txtuserPwd.setText(" ");
			}
		});
		
		add(lbluserName);
		add(txtuserName);
		add(lblcontact);
		add(txtcontact);
		add(lblemail);
		add(txtemail);
		add(lbluserPwd);
		add(txtuserPwd);
		add(btnSubmit);
		add(btnReset);
		
		setTitle("Register Page");
		setSize(400,400);
		setLayout(null);
		setVisible(true);
	}
	public static void main(String[] args) 
	{
		Register register=new Register();
	}

}

