package UserModel;

import java.awt.*;
import javax.swing.*;
import Controller.Controller;

public class Model 
{
	private String userName;
	private String userPwd;
	private String email;
	private String contact;
	
	public Model()
	{
		super();
	}
	public Model(String userName,String userPwd,String email,String contact)
	{
		super();
		this.userName=userName;
		this.userPwd=userPwd;
		this.email=email;
		this.contact=contact;
	}
	public String getUserName()
	{
		return userName;
	}
	public void setUserName(String userName)
	{
		this.userName=userName;
	}
	public String getUserPwd()
	{
		return userPwd;
	}
	public void setUserPwd(String userPwd)
	{
		this.userPwd=userPwd;
	}
	public String getEmail()
	{
		return email;
	}
	public void setEmail(String email)
	{
		this.email=email;
	}
	public String getContact()
	{
		return contact;
	}
	public void setContact(String contact)
	{
		this.contact=contact;
	}
	@Override
	public String toString()
	{
		return "Model [userName = "+userName+",userPwd = "+userPwd+",email="+email+",contact="+contact+"]";
	}
}