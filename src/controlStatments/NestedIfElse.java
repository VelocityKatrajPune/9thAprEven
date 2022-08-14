package controlStatments;

public class NestedIfElse {

	public static void main(String[] args) {
		
		//if UN is correct then enter PWD,
		//if PWD is correct then Login successful
		//else PWD is wrong--> Please enter valid PWD
		//else UN is worng-->Please enter valid UN
		
		String UN="Velocit";
		String PWD="Velocity@123";
		
		if(UN=="Velocity")
		{
			System.out.println("Correct UN, Please enter PWD");
			
			if(PWD=="Velocity@123")
			{
				System.out.println("Correct PWD, Login successfully");
			}
			else 
			{
				System.out.println("invalid PWD, login faild");
			}
			
		}
		
		else 
		{
			System.out.println("Invalid UN, Please enter valid UN");
		}
		

	}

}
