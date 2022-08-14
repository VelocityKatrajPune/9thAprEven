package loops;

public class ForLoopStudy {

	public static void main(String[] args) 
	{
//		System.out.println(5);
//		System.out.println(5);
//		System.out.println(5);
//		System.out.println(5);
//		System.out.println(5);

		
	//1---2  3-- 4-->5

		//initialization
		//condition
		//updation
	
		for(int a=1; a<=5; a++)//a=1;2;3;4;5;6
		{
			System.out.println("Velocity");//5,5,5,5,5
		}
		
		
		//I want to print 1----10 numbers
		//initialization-->1
		//condition--> <=10
		//updation--> a++
		
		for(int a=1;a<=50;a++)
		{
			System.out.println(a);
		}
		
		
		//initialization-->2
		//condition--> <=20
		//updation--> a+2
		
		for(int a=2;a<=20;a=a+2)
		{
			System.out.println(a);
		}
	}

}
