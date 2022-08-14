package generalisation;

public class SBI implements RBI

{

	@Override
	public void depoist() 
	{
		System.out.println("SBI deposit IR-5%");
		
	}

	@Override
	public void loan() 
	{
	System.out.println("SBI Loan IR-8%");	
		
	}

	@Override
	public void transfer() {
		System.out.println("SBI have NEFT, IMPS,RTGS");
		
	}
	
	public void YONO()
	{
		System.out.println("SBI's own method");
	}

}
