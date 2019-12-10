package polymorphism;

import java.util.Scanner;

public class Hotel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Customer c = new Customer();
		String a=s.next();
		int x=s.nextInt();
		String b=s.next();
		int y=s.nextInt();
		String d=s.next();
		int z=s.nextInt();
		if(b.equals("null")==true && d.equals("null")==true) {
		c.order(a);
		}
		if(d.contentEquals("null")==true) {
		c.order(a,b);
		}
		c.order(a,b,d);
		if(b.equals("null")==true && d.equals("null")==true && y==0 && z==0) {
		c.food(a,x);
		}
		if(d.contentEquals("null")==true && z==0) {
		c.food(a,x,b,y);
		}
		c.food(a,x,b,y,d,z);

	}

}
class Food{
	public void food(String a,int x) {
		System.out.println(x+" "+a+" is ordered");
	}
	public void food(String a,int x,String b,int y) {
		System.out.println(x+" "+a+"is ordered \n"+y+" "+b+" is ordered\n");
	}
	public void food(String a,int x,String b,int y,String d,int z) {
		System.out.println(x+" "+a+" is ordered \n "+y+" "+b+" is ordered \n"+z+" "+d+" is ordered\n");
	}
}
class Customer extends Food{

	public void order(String a) {
		// TODO Auto-generated method stub
		System.out.println("Customer has ordered "+a);
		
	}

	public void order(String a, String b, String d) {
		// TODO Auto-generated method stub
		System.out.println("Customer has orderd "+a+" and "+b+" and "+ d);
		
	}

	public void order(String a, String b) {
		// TODO Auto-generated method stub
		System.out.println("Customer has ordered "+a+" and "+b);
		
	}
	
}