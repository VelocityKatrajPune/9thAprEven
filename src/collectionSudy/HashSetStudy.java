package collectionSudy;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetStudy {

	public static void main(String[] args) 
	{
		
		HashSet hs= new HashSet();
		
		hs.add("Pune");
		hs.add(true);
		hs.add(123);
		hs.add(99.99);
		hs.add(123);
		hs.add('A');
		hs.add(null);
		hs.add(null);
		
		System.out.println(hs);
		

			//does not supports for loop--> get method is not available 
		
		for(Object w:hs)
		{
			System.out.println(w);
		}
		System.out.println("=====================");
		//iterator 
		
		Iterator it = hs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		



	}

}
