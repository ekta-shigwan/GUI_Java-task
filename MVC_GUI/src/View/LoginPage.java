package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import Controller.Controller;
import UserModel.Model;
import View.Register;

public class LoginPage extends JFrame 
{
		JTextField txtUserPwd,txtUserName;
		JLabel lblUserName,lblUserPwd;
		JButton btnSubmit,btnReset;
		
		Controller Controller;
		
		public LoginPage(Model UserModel) 
		{
			Controller=new Controller();
			
			lblUserName=new JLabel("Enter your Name	: ");
			lblUserName.setBounds(10,80,160,30);
			
			lblUserPwd=new JLabel("Enter Password	: ");
			lblUserPwd.setBounds(10,110,160,30);

			txtUserName=new JTextField();
			txtUserName.setBounds(160, 90, 110, 20);
			
			txtUserPwd=new JTextField();
			txtUserPwd.setBounds(160, 120, 110, 20);		
			
			btnSubmit=new JButton("Login");
			btnSubmit.setBounds(10,160,110, 20);

			btnSubmit.addActionListener(new ActionListener()
			{
				@Override
				public void actionPerformed(ActionEvent e)
				{
					String name = txtUserName.getText();
					String pass=txtUserPwd.getText();
					
					boolean valid=Controller.loginUser(name,pass,UserModel);
					{
						if(valid)
						{
							HomePage homepage=new HomePage(UserModel);
							setVisible(false);
							homepage.setVisible(true);
						}
						else
						{
							FailureGUI fail = new FailureGUI();
							setVisible(false);
							fail.setVisible(true);
						}
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
					txtUserName.setText(" ");
					txtUserPwd.setText(" ");
				}
			});
			
			add(lblUserName);
			add(txtUserName);
			add(lblUserPwd);
			add(txtUserPwd);
			add(btnSubmit);
			add(btnReset);
			
			setTitle("Varification Window ");
			setSize(400,400);
			setLayout(null);
			setVisible(true);
			
			}
	}


