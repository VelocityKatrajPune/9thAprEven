package generalisation;

public class Banking {

	public static void main(String[] args) 
	{
		SBI s= new SBI();
		BOI b= new BOI();
		Axis a= new Axis();
		
		s.depoist();
		s.loan();
		s.transfer();
		s.YONO();
		System.out.println("===============");
		
		b.depoist();
		b.transfer();
		b.loan();
		b.BOIStarAPP();
		
		
		System.out.println("===============");
		
		a.depoist();
		a.transfer();
		a.loan();
		a.axisAPP();
		
		
		
	}

}
