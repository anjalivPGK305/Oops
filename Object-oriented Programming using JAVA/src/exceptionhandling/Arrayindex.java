package exceptionhandling;

public class Arrayindex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try 
		{
			int[] a= new int[5];
			a[7] = 45;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}

	}

}
