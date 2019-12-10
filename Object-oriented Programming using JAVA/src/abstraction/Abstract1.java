package abstraction;

import java.util.Scanner;

public class Abstract1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the student details");
		System.out.println("Enter the name");
		String name=s.next();
		System.out.println("Enter the student_id");
		int id = s.nextInt();
		System.out.println("Enter the marks");
		int m1=s.nextInt();
		int m2=s.nextInt();
		int m3=s.nextInt();
		int m4=s.nextInt();
		int m5=s.nextInt();
		int total=m1+m2+m3+m4+m5;
		float avg=total/5;
		Student st = new Student();
		st.total(total,avg);

	}

}
abstract class rank{
	abstract void total(int total,float avg);
	public void rank(int total) {
		if(total>450)
		{
			System.out.println("Rank1");
		}
		else if(total>400) {
			System.out.println("Rank2");
		}
		else if(total>350)
		{
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
	
}
class Student extends rank{

	public void total(int total,float avg) {
		// TODO Auto-generated method stub
		System.out.println(total);
		System.out.println(avg);
		super.rank(total);
		
	}
	
}
