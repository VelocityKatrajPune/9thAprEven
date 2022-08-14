package constructor;



public class Test 
{

//	public Test()
//	{
	//default constructor--> complier will create at time of compilation
//		
//	}
	
	public Test()// user defined constructor--> without parameter/with zero parameter
	{
		System.out.println("This is user defined constructor ");
	}
	
	
	public static void main(String[] args) 
	{
		Test t= new Test();// created object of class
		

	}

}
