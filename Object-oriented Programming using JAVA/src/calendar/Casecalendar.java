package calendar;
import java.time.LocalDate;
import java.util.Scanner;
import java.time.temporal.ChronoUnit;
public class Casecalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str="";
		do {
			
		System.out.println("Enter the name");
		String name= s.next();
		System.out.println("Enter the Address");
		String address= s.next();
		System.out.println("No of rooms");
		int room= s.nextInt();
		System.out.println("No of person");
		int person= s.nextInt();
		System.out.println("AC or NON-AC");
		String ac= s.next();
		System.out.println("Booking Date");
		String start= s.next();
		System.out.println("Checkout Date");
        String end= s.next();	
        LocalDate ds = LocalDate.parse(start);
        LocalDate de = LocalDate.parse(end);
        long total = ChronoUnit.DAYS.between(ds,de);
		int acprice,amount=0,rprice=1000;
		int extra=250;
		if(ac.contentEquals("yes")==true)
		{
			acprice=150;
		}
		else
		{
			acprice=0;
		}
		if(person>(room*3))
		{
			System.out.println("Book one more room");
		}
		else if(person>(room*2))
		{
			amount=(((rprice+acprice)*room)+extra)*(int)total;
		}
		
		else
		{
			amount=(((rprice+acprice)*room)*(int)total);
		}
		if(amount!=0)
		{
		System.out.println("Reg-Details:");
		System.out.println("Name:"+name);
		System.out.println("Address:"+address);
		System.out.println("No of Rooms:"+room);		
		System.out.println("No of Guest:"+person);
		System.out.println("AC:"+ac);
		System.out.println("No of Days:"+total);
		System.out.println("Amount:"+amount);
		}
		System.out.println("Do you want to continue Registration?");
		str=s.next();
		}while(str.equals("yes")==true);
	}

}
