package polymorphism;

import java.util.Scanner;

public class Override1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		ABC ob1 = new ABC();
		ob1.disp();
		Demo ob = new Demo();
		ob.disp();

	}

}
class ABC{

	public void disp() {
		// TODO Auto-generated method stub
		System.out.println("Parent Class");
		
	}
	
}
class Demo extends ABC{
	public void disp() {
		System.out.println("Child Class");
	}
}