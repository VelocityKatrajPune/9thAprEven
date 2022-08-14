package logicalPrograms;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter the string");
		String s=sc.next();
		String r="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			r=r+s.charAt(i);
		}
		
		System.out.println("Orignal string is "+s);
		System.out.println("Reverse string is "+r);
		
		if(s.equals(r))
		{
			System.out.println("Given string is Palindrome");
		}
		else 
		{
			System.out.println("Given string is not Palindrome");
		}

	}

}
