package arrayStudy;

public class ArrayEg1 {

	public static void main(String[] args) {
		// I want to store city names
		
		
		//1. Array declaration
		 String city[]=new String[8];
		 
		 //2. Array initialize 
		 
		 city[0]="Pune";
		 city[1]="Dhule";
		 city[2]="Beed";
		 city[3]="Thane";
		 city[4]=null;
		 city[5]="Mumbai";
		 city[6]="Solapur";
		 city[7]="latur";
		 
		 //3. usage
		 
		 System.out.println(city[0]);
		 System.out.println(city[1]);
		 System.out.println(city[2]);
		 System.out.println(city[3]);
		 System.out.println(city[4]);
		 
		 System.out.println("====================");
		 for(int i=0;i<=4;i++)
		 {
			 System.out.println(city[i]);
		 }
		 
		 System.out.println("====================");
		 for(int i=4;i>=0;i--)
		 {
			 System.out.println(city[i]);
		 }
		 System.out.println("====================");
		 
		 
		 System.out.println(city.length);
		 
		 for(int i=0;i<=city.length-1; i++)
		 {
			 System.out.println(city[i]);
		 }
		
		 
		 System.out.println("====================");
		 
		 for(int i=city.length-1;i>=0;i--)
		 {
			 System.out.println(city[i]);
		 }
		 
		 
		 
		 
		 
		 
		// System.out.println(city[19]);
		 
		 System.out.println("==================================");
		 
//		 
//		//1. Array declaration
//		 int count[]= new int[3];
//		 
//		 //2. initialize 
//		 
//		 count[0]=10;
//		 
//		 //3.usage
//		 
//		 System.out.println(count[0]);
//		 System.out.println(count[1]);
//		 

	}

}
