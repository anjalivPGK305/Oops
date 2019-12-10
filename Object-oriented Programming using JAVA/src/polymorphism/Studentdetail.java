package polymorphism;

import java.util.Scanner;

public class Studentdetail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Avg av = new Avg();
		System.out.println("Name:");		
		String name=s.next();
		System.out.println("Rollno:");
		int rollno = s.nextInt();
		System.out.println("Department:");
		String dept=s.next();
		System.out.println("Year:");
		int year=s.nextInt();
		System.out.println("Enter marks:");
		int mark1=s.nextInt();
		int mark2=s.nextInt();
		int mark3=s.nextInt();
		int mark4=s.nextInt();
		int mark5=s.nextInt();
		int total=mark1+mark2+mark3+mark4+mark5;
		
		av.avg(mark1,mark2,mark3,mark4,mark5,total);
		av.avg(total);
		av.rank(total);
		
		

	}

}
class Stud{
	public void rank(int tot) {
		if(tot>450)
		{
			System.out.println("\nRank1");
		}
		else if(tot>400)
		{
			System.out.println("\nRank2");
		}
		else if(tot>350)
		{
			System.out.println("\nRank3");
		}
		else if(tot>300)
		{
			System.out.println("\nRank4");
		}
		else
		{
			System.out.println("\nFail");
		}
		
	}
	
}
class Avg extends Stud{

	public void avg(int tot) {
		// TODO Auto-generated method stub

		float avg=tot/5;
		System.out.printf("Average\n"+avg);
		
	}

	public void avg(int mark1, int mark2, int mark3, int mark4, int mark5,int tot) {
		// TODO Auto-generated method stub
		System.out.println(mark1);
		System.out.println(mark2);
		System.out.println(mark3);
		System.out.println(mark4);
		System.out.println(mark5);
		System.out.println("Total\n"+tot);
		
	}
	
}