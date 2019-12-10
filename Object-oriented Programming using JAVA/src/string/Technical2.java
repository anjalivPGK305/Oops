package string;

import java.util.Arrays;
import java.util.Scanner;

public class Technical2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int flag=0;
		System.out.println("Enter the guest's name");
		String guest= s.next();
		System.out.println("Enter the name of residence host");
		String host = s.next();
		System.out.println("Enter the letters in pile");
		String letters= s.next();
		int l1=guest.length();
		int l2=host.length();
		String str= guest+host;
		int len= letters.length();
		char ch[]= str.toCharArray();
		char ch1[]=letters.toCharArray();
		Arrays.sort(ch);
		Arrays.sort(ch1);
		String x=new String(ch);
		String y=new String(ch1);
		for(int i=0;i<(l1+l2);i++)
		{
			for(int j=0;j<len;j++)
			{
				flag=0;
			if(x.equals(y)==true && (l1+l2)==len)
			{
				flag=1;
				break;
			}	
		}
		}
		if(flag==1)
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
		

	}

}
