package exceptionhandling;

public class Throws {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=4;
		int b=6;
		if(a<b)
			throw new ArithmeticException("B is greater");
		else
			throw new ArithmeticException("A is greater");

	}

}
