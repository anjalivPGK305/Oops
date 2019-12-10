package abstraction;

import java.util.Scanner;

public class Caseabstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Register r = new Register();
		String str,em,email1;
		do {
		System.out.println("Registration");
		System.out.println("Enter your name");
		String name=s.next();
		System.out.println("Enter your address");
		String address=s.next();
		System.out.println("ContactNumber");
		String contact=s.next();
		System.out.println("E-Mail ID");
		String email=s.next();
		System.out.println("Prooftype");
		String prooftype=s.next();
		System.out.println("Proofid");
		String proofid=s.next();
		System.out.println("Thank you for registering.Your id is 1..");
		System.out.println("Do you want to continue Registration(y/n)");
		str=s.next();
		System.out.println("Do you want to update emailId?(yes/no)");
		em=s.next();
		if(em.contentEquals("yes")==true) {
			r.email();

		r.show(name,address,contact,email,prooftype,proofid);
		}
		
		
		}while(str.equals("y")==true);
	}

}
interface email{
	public String email();
}
interface show{
	public void show(String name,String address,String contact,String email1,String prooftype,String proofid);	
}
class Register implements email,show {
	public String email() {
		Scanner s = new Scanner(System.in);
		System.out.println("Update Email:");
		System.out.println("Enter new Email_ID");
		String email1=s.next();
		System.out.println("Email Updated");
		return email1;
	}
		
	public void show(String name,String address,String contact,String email1,String prooftype,String proofid) {
		System.out.println("Your details are as follows");
		System.out.println("Name:"+name);
		System.out.println("Address:"+address);
		System.out.println("Contact Number:"+contact);
		System.out.println("Email_ID:"+email1);
		System.out.println("Prooftype:"+prooftype);
		System.out.println("Proofid:"+proofid);
	
		
	}
	
}
