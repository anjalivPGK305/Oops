package exceptionhandling;

public class Null {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			String str=null;
			System.out.println(str.length());
		}catch(NullPointerException e)
		{
			System.out.println(e+"check the string");
		}

	}

}
