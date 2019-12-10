package exceptionhandling;

public class Finally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int[] a= new int[5];
			a[9]=34/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Program closed");
		}
		

	}

}
