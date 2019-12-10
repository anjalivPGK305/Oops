package encapsulation;
import java.util.Scanner;
public class Encapsulationcase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a,i=1,k=1;
		double total=0,ss=0;
		Ticket t = new Ticket();
		System.out.println("Enter the price of a ticket:");
		t.setPrice(s.nextInt());
		System.out.println("Enter Number of Persons:");
		t.setNum(s.nextInt());
		a=t.getNum();
		do {
		System.out.printf("Enter Details for Person %d\n",i);
		System.out.println("Name:");
		t.setName(s.next());
		System.out.println("Gender(M/F)");
		t.setGender(s.next());
		System.out.println("Age");
		t.setAge(s.nextInt());
		total= t.person1(t.getAge(),t.getGender(),t.getNum(),t.getPrice(),ss);
		ss=total;
		if(a==1)
		{
			t.person(t.getPrice(),t.getNum(),ss);
		}
		a--;
		i++;
		}while(a>0);

	}
}
class Ticket{
	int i=1,j=0;
	int price;
	int num;
	String name;
	String gender;
	int age;
	double total=0,sum=0;

	public int getPrice() {
		return price;
	}

	

	public void setPrice(int price) {
		this.price = price;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void person(int price,int num,double total) {
		System.out.println("Ticket Details are:");
		System.out.println("Number of passengers:"+num);
		System.out.println("Price of a ticket:"+price);
		System.out.println("Total Amount:"+total);
	}
		
		public double person1(int age, String gender, int num, int price,double total) {
			// TODO Auto-generated method stub
			total=0;
			double p=.25,q=.10,r=.50;
			if(j<=num)
			{
			if(age<16) {
			   total = (double)sum+(price-(price*r));
			   sum=total;
			   return total;
			}
			
			else if(age>64)
			{
				total=sum+(price-(price*p));
				sum=total;
				return total;
			}
			else if(age>=16 && gender.contentEquals("F")==true ) {
				total=sum+(price-(price*q));
				sum=total;
				return total;
			}
			else
			{
				total=sum+price;
				sum=total;
				return total;
			 }
			}
			else
			{
				j++;
				return sum;
			}
		}
}
	
	
		
	
	

	

