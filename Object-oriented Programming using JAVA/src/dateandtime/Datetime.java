package dateandtime;

import java.time.*;

public class Datetime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Current Date");
		LocalDate date= LocalDate.now();//create a date object
		System.out.println(date);//display the current date
		
		System.out.println("Current Time");
		LocalTime time= LocalTime.now();//create object for time
		System.out.println(time);//display current time
		
		System.out.println("Current date and time");
		LocalDateTime dt= LocalDateTime.now();//create object for date&time
		System.out.println(dt);//display current date and time
		
		

	}

}
