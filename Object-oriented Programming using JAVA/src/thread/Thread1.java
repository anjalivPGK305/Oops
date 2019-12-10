package thread;

public class Thread1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a= new A();
		a.start();

	}

}
class A extends Thread
{
	public void run()
	{
		String s= "welcome";
		int l= s.length();
		for(int i=0;i<l;i++)
		{
			char c[]= s.toCharArray();
			try
			{
				System.out.println(c[i]);
				Thread.sleep(15000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}
