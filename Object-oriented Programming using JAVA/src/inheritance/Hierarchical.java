package inheritance;
import java.util.Scanner;
public class Hierarchical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the no of fruits");
		int n = s.nextInt();
		Apple a = new Apple();
		Orange o = new Orange();
		a.fruit();
		a.name();
		a.about();
		o.about();
		o.number(n);

	}

}
