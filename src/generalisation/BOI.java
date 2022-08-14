package generalisation;

public class BOI implements RBI{

	@Override
	public void depoist()
	{
	
		System.out.println("BOI deposit IR-5.8%");
	}

	@Override
	public void loan() {
		System.out.println("BOI Loan IR-8.5%");	
		
	}

	@Override
	public void transfer() {
		System.out.println("SBI have NEFT, IMPS,RTGS, CDM");
		
	}
	
	public void BOIStarAPP()
	{
		System.out.println("BOI's own method");
	}

}
