package calendar;
import java.util.Calendar;
public class Calen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar calendar= Calendar.getInstance();
		System.out.println("At present calendar's year:"+calendar.get(Calendar.YEAR));//display current year
		System.out.println("At present calendar's Day:"+calendar.get(Calendar.DATE));//display current day
		System.out.println("The current date is : " + calendar.getTime());//display current date
	    calendar.add(Calendar.DATE, -7);//to get date of before 7 days
	    System.out.println("7 days ago: " + calendar.getTime());
	    calendar.add(Calendar.MONTH, 10);//to get the date after 10 month
	    System.out.println("10 months later: " + calendar.getTime());
	    calendar.add(Calendar.YEAR, 10);// to get the date of after 10 years
	    System.out.println("10 years later: " + calendar.getTime());
		
		

	}

}
