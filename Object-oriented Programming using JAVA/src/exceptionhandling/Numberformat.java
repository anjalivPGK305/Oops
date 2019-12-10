package exceptionhandling;

public class Numberformat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			String s="abcd";
			int i=Integer.parseInt(s);
		}
		catch(NumberFormatException e)
		{
			System.out.println(e);
		}

	}

}
