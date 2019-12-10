package Regularexp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Userpass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";//email validation code
		 Pattern pswNamePtrn = Pattern.compile("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,15})");//password validation code
		 Pattern pattern = Pattern.compile(regex);//Pattern is a class.here check email validation
		System.out.println("Enter the username");
		String username= s.next();
		Matcher user = pattern.matcher(username);//Matcher is class.username is variable.user is object of Matcher
		System.out.println("Enter the password");
		String password= s.next();
		Matcher pass= pswNamePtrn.matcher(password);//password is variable.pass is object of Matcher
		if(user.matches())//matches is the result set of matcher class
		{
		System.out.println("Valid username");
		}
		else
		{
		System.out.println("Invalid username");
		}
		if(pass.matches())
		{
			System.out.println("Valid password");
		}
		else
		{
			System.out.println("Invalid password");
		}


	}

}
