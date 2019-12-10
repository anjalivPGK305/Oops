package Regularexp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regcase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";//email validation code
		Pattern pswNamePtrn = Pattern.compile("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,15})");//password validation code
		Pattern pattern = Pattern.compile(regex);//Pattern is a class.here check email validation
		String firstName = "[A-Z][a-z]*"; //first name validation
	    Pattern name1=Pattern.compile(firstName);//check first name validation
	    String lastname = "[A-Z]";//last name validation
	    Pattern name2=Pattern.compile(lastname);// check last name validation
	    String num = "[0-9]*";//number validation
	    Pattern nump= Pattern.compile(num);//check number validation
	    String department= "[A-Z]*.[A-Z]*";
	    Pattern depart=Pattern.compile(department);
		System.out.println("Enter the firstname");
		String name= s.next();
		Matcher m=name1.matcher(name);
		System.out.println("Enter the last name");
		String last= s.next();
		Matcher mlast=name2.matcher(last);
		System.out.println("Enter email Id");
		String email= s.next();
		Matcher m1= pattern.matcher(email);
		System.out.println("Enter the register no");
		String reg= s.next();
		Matcher m2= nump.matcher(reg);
		System.out.println("Enter the Rank");
		String rank= s.next();
		Matcher m3= nump.matcher(rank);
		System.out.println("Enter the year");
		String year= s.next();
		Matcher m4= nump.matcher(year);
		System.out.println("Enter the department");
		String dept= s.next();
		Matcher m5= depart.matcher(dept);
		if(m.matches() && mlast.matches() && m1.matches() && m2.matches() && m3.matches() && m4.matches() && m5.matches())
		{
			System.out.println("Enter the username");
			String username= s.next();
			Matcher us=pattern.matcher(username);
			System.out.println("Enter the password");
			String password= s.next();
			Matcher pa=pswNamePtrn.matcher(password);
			if(us.matches())
			{
				System.out.println("Valid username");
			}
			else
			{
				System.out.println("Invalid username");
			}
			if(pa.matches())
			{
				System.out.println("Valid password");
			}
			else
			{
				System.out.println("Invalid password");
			}			
		}
		else if(m.matches()==false)
		{
			System.out.println("Invalid firstname");
		}
		else if(mlast.matches()==false)
		{
			System.out.println("Invalid lastname");
		}
		else if(m1.matches()==false)
		{
			System.out.println("Invalid email id");
		}
		else if(m2.matches()==false)
		{
			System.out.println("Invalid Regno");
		}
		else if(m3.matches()==false)
		{
			System.out.println("Invalid Rank");
		}
		else if(m4.matches()==false)
		{
			System.out.println("Invalid year");
		}
		else
		{
			System.out.println("Invalid Department");
		}

	}

}
