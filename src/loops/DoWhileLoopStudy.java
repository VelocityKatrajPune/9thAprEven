package loops;

public class DoWhileLoopStudy {

	public static void main(String[] args) {
		// I want 4 table
				// initialization--> 4
				// condition------->i<=40
				// updation--------> i=i+4

		int i=4;//initialization
		
		do 
		{
			System.out.println(i);//4,8,.....36,40
			i=i+4;//8,12..........40,44
		} 		
		while (i<=40);
	
	}

}
