package logicalPrograms;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) 
	{
		//String s="Velocity";
		//			yticoleV
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter String");
		String s=sc.next();
		
		String r="";
		
		for(int i=s.length()-1;i>=0;i--)//7,6,5....0
		{
			r=r+s.charAt(i);
			//y=""+y;
			//yt=y+t;
			//r=yticoleV
		}
		
		System.out.println("Reverse string is "+r);

	}

}
