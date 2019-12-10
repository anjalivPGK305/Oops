package exceptionhandling;

public class Arith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int i=50/0;
			System.out.println(i);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}

	}

}
