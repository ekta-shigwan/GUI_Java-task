package Controller;

import java.util.regex.*;
import UserModel.Model;

public class Controller 
{
	public boolean registerUser(Model UserModel)
	{
		String receivedName=UserModel.getUserName();
		String receivedPass=UserModel.getUserPwd();
		String receivedEmail=UserModel.getEmail();
		String receivedContact=UserModel.getContact();
	
		Pattern pattern=Pattern.compile("@");
		Matcher match=pattern.matcher(receivedEmail);
		if(match.find())
		{
			return true;
		}
		return false;
	}
	public boolean loginUser(String name, String pass,Model Mdl)
	{
		String receivedName=name;
		String receivedPass=pass;
		if(receivedName.equals(Mdl.getUserName())&&receivedPass.equals(Mdl.getUserPwd()))
		{
			return true;
		}
		return false;
	}
}
