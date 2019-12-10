package string;

import java.util.Scanner;

public class Strbufcasestudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str="";
		int i=1;
		do {
		StringBuffer sb= new StringBuffer();
		System.out.println("Registration");
		System.out.println("Enter your name");
		sb.append("Name "+s.next()+"\n");
		System.out.println("Enter your address");
		sb.append("Address "+s.next()+"\n");
		System.out.println("ContactNumber");
		sb.append("ContactNumber "+s.next()+"\n");
		System.out.println("E-Mail ID");
		sb.append("E-Mail "+s.next()+"\n");
		System.out.println("ProofType");
		sb.append("ProofType "+s.next()+"\n");
		System.out.println("ProofID");
		sb.append("Proof ID "+s.next()+"\n");
		System.out.printf("Thanks for registering.Your id is %d..\n",i);
		i++;
		System.out.println("Do you want to continue Registration");
		str= s.next();				
		System.out.println(sb);
		}while(str.contentEquals("yes")==true);
	}
}
