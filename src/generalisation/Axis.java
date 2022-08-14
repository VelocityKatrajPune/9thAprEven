package generalisation;

public class Axis implements RBI{

	@Override
	public void depoist() {
		System.out.println("Axis deposit IR-9.8%");
		
	}

	@Override
	public void loan() {
		System.out.println("Axis Loan IR-9.5%");	
		
	}

	@Override
	public void transfer() {
		System.out.println("Axis have  CDM");
		
	}
	
	public void axisAPP()
	{
		System.out.println("Axis banks own method");
	}

}
