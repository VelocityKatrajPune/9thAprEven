package collectionSudy;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetStudy {

	public static void main(String[] args)
	{
		LinkedHashSet ls= new LinkedHashSet();
		
		ls.add("Pune");
		ls.add(123);
		ls.add(22.2);
		ls.add('A');
		ls.add("Pune");
		ls.add(null);
		ls.add(null);
		ls.add(true);
		
		System.out.println(ls);
		
		//methods
		
		//for each
		//iterator
		
		Iterator it = ls.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
