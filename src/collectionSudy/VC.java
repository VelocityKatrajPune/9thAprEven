package collectionSudy;

import java.util.Enumeration;
import java.util.Vector;

public class VC {

	public static void main(String[] args) {
		 Vector al = new Vector();
		 al.add("Nagpur");
		 al.add(14.05);
		 al.add(1405);
		 al.add('C');
		 al.add(null);
		 al.add(null);
		 al.add(true);
		 al.add("Nagpur");
		 System.out.println("****object al generic and its normal vector print****");
	
	Enumeration el = al.elements();
	while(el.hasMoreElements())
	{
		System.out.println(el.nextElement());
	}
	
	
	}

}
