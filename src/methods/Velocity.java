package methods;

public class Velocity {

	public static void main(String[] args) 
	{
		test();// calling static regular method from same class--> syntax-->methodname();
		Sample.display();// calling static regular method from another class--> syantax--> classname.methodname();
	}

	public static void test()// static regular method
	{
		System.out.println("HI this is statis regular method from Velocity class");
		
	}
	
}
