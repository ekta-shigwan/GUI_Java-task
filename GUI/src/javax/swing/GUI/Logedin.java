package javax.swing.GUI;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.*;

public class Logedin extends JFrame 
{
	JTextField txtE_mail,txtPassword,txtUser,txtContact;
	JLabel lblE_mail,lblPassword,lblGreet;
	JButton btnSubmit,btnCancel,btnExit;
	
	public Logedin() 
	{
		lblE_mail=new JLabel("Enter your E-mail	: ");
		lblE_mail.setBounds(10,80,160,30);
		
		lblPassword=new JLabel("Enter Password	: ");
		lblPassword.setBounds(10,110,160,30);
		
		lblGreet=new JLabel();
		lblGreet.setBounds(150,150,180,50);

		txtE_mail=new JTextField();
		txtE_mail.setBounds(160, 90, 110, 20);
		
		txtPassword=new JTextField();
		txtPassword.setBounds(160, 120, 110, 20);		
		
		btnSubmit=new JButton("Submit");
		btnSubmit.setBounds(10,160,110, 20);

		btnSubmit.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				setVisible(false);
				Last_window log=new Last_window();
			}
		});
		
		btnCancel=new JButton("Cancel");
		btnCancel.setBounds(130, 160, 110, 20);
		
		btnCancel.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				txtE_mail.setText(" ");
				txtPassword.setText(" ");
			}
		});
		
		add(lblE_mail);
		add(txtE_mail);
		add(lblPassword);
		add(txtPassword);
		add(btnSubmit);
		add(btnCancel);
		
		setTitle("Varification Window ");
		setSize(400,400);
		setLayout(null);
		setVisible(true);
		
		}
}
