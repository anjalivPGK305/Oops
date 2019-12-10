package polymorphism;

import java.util.Scanner;

public class Overload1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Add a = new Add();
		int n1=s.nextInt();
		int n2=s.nextInt();
		int n3=s.nextInt();
		
		a.add(n1);
		a.add(n1,n2);
		a.add(n1,n2,n3);

	}

}
class Add{
	public void add(int n1) {
		System.out.println("Firstnumber:"+n1);
	}
	public void add(int n1, int n2, int n3) {
		// TODO Auto-generated method stub
		System.out.println("Add three number:"+(n1+n2+n3));
		
	}
	public void add(int n1,int n2) {
		System.out.println("Add two number:"+(n1+n2));
	}
}
