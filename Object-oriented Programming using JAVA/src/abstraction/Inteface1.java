package abstraction;

import java.util.Scanner;

public class Inteface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the name");
		String name=s.next();
		System.out.println("Enter id");
		int id=s.nextInt();
		System.out.println("Enter marks");
		int m1=s.nextInt();
		int m2=s.nextInt();
		int m3=s.nextInt();
		int m4=s.nextInt();
		int m5=s.nextInt();
		int total=m1+m2+m3+m4+m5;
		Stud1 st=new Stud1();
		st.detail(name,id,total);
		st.total(total);

	}

}
interface rank1{
	public void total(int total);
}
interface total{
	public void detail(String name,int id,int total);
}
class Stud1 implements rank1,total{
	public void total(int total) {
		if(total>450) {
			System.out.println("Rank1");
		}
		else if(total>400) {
			System.out.println("Rank2");
		}
		else if(total>350) {
			System.out.println("Rank3");
		}
		else if(total>300) {
			System.out.println("Rank4");
		}
		else
		{
			System.out.println("Fail");
		}
		
	}
	public void detail(String name,int id,int total) {
		System.out.println("Name:"+name);
		System.out.println("Id:"+id);
		System.out.println("Total:"+total);
		
	}
}