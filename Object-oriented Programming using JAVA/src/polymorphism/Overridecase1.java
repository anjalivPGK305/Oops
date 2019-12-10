package polymorphism;

import java.util.Scanner;

public class Overridecase1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Bike b = new Bike();
		Car c = new Car();
		
		System.out.println("1)Car\n2)Bike\n");
		int n=s.nextInt();
		switch(n) {
		case 1:System.out.println("Enter the details of Car");
		System.out.println("Enter the color");
		c.setColor(s.next());
		System.out.println("Enter the maximum speed");
		c.setSpeed(s.nextInt());
		System.out.println("Enter the number of seats");
		c.setSeat(s.nextInt());
		System.out.println("Enter the number of wheels");
		c.setWheel(s.nextInt());
		System.out.println("Enter the number of Doors");
		c.setDoor(s.nextInt());
		System.out.println("Enter the status of AC(true/false)");
		c.setAc(s.next());
	    c.displayDetails();
		break;
		case 2:System.out.println("Enter the details of Bike");
		System.out.println("Enter the color");
		b.setColor(s.next());
		System.out.println("Enter the maximum speed");
		b.setSpeed(s.nextInt());
		System.out.println("Enter the number of seats");
		b.setSeat(s.nextInt());
		System.out.println("Enter the number of wheels");
		b.setWheel(s.nextInt());
		System.out.println("Enter the status of diskbreak(true/false)");
		b.setDiskbreak(s.next());
			b.displayDetails();
			break;
		case 3:System.out.println("Invalid option");
		break;
		}

	}

}

class Vehicle
{
	String color;
	int speed;
	int seat;
	int wheel;
	int door;
	String ac;
	String diskbreak;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getSeat() {
		return seat;
	}

	public void setSeat(int seat) {
		this.seat = seat;
	}

	public int getWheel() {
		return wheel;
	}

	public void setWheel(int wheel) {
		this.wheel = wheel;
	}

	public int getDoor() {
		return door;
	}

	public void setDoor(int door) {
		this.door = door;
	}

	public String getAc() {
		return ac;
	}

	public void setAc(String ac) {
		this.ac = ac;
	}

	public String getDiskbreak() {
		return diskbreak;
	}

	public void setDiskbreak(String diskbreak) {
		this.diskbreak = diskbreak;
	}
}
class Bike extends Vehicle{

	void displayDetails() {
		// TODO Auto-generated method stub
		System.out.println("Bike Details");
		System.out.println("Color:"+color);
		System.out.println("Maximum speed:"+speed);
		System.out.println("No of seats:"+seat);
		System.out.println("No of wheels:"+wheel);
		System.out.println("Disk Break:"+diskbreak);		
	}
	
	
}
class Car extends Vehicle{

	void displayDetails() {
		// TODO Auto-generated method stub
		System.out.println("Bike Details");
		System.out.println("Color:"+color);
		System.out.println("Maximum speed:"+speed);
		System.out.println("No of seats:"+seat);
		System.out.println("No of wheels:"+wheel);
		System.out.println("No of Doors:"+door);
		System.out.println("Ac:"+ac);	
	}
	
}