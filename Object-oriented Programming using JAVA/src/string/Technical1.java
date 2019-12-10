package string;

import java.util.Scanner;

public class Technical1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		String str="qwertyuiop asdfghjkl; zxcvbnm,./";
		char c;
		String str1;
		System.out.println("Enter a character");
		c= s.next().charAt(0);
		System.out.println("Enter the string");
		str1= s.next();
		System.out.println("Original message");
		int i,j;		
		char ch[]= str.toCharArray();
		char ch1[]= str1.toCharArray();
		for(i=0;i<ch1.length;i++)
		{
			for(j=0;j<ch.length;j++)
			{
				if(ch1[i]==ch[j] && c=='R')
				{
					System.out.printf("%c",ch[j-1]);
				}
				if(ch1[i]==ch[j] && c=='L')
				{
					System.out.printf("%c",ch[j+1]);
				}
			}
		}

	}

}
