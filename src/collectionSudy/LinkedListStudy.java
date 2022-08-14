package collectionSudy;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListStudy {

	public static void main(String[] args) 
	{
		LinkedList ll= new LinkedList();
		
		ll.add("Pune");
		ll.add('A');
		ll.add(123);
		ll.add(123.12);
		ll.add(true);
		ll.add(123);
		ll.add(null);
		ll.add(null);
		
		System.out.println(ll);
		System.out.println(ll.size());
		System.out.println(ll.get(3));
		System.out.println(ll.peek());
		System.out.println(ll);
		System.out.println(ll.peekLast());
		System.out.println(ll.poll());
		System.out.println(ll);
		System.out.println(ll.pollLast());
		System.out.println(ll);
		
		
		//for loop// for each// iterator// listIterator 
		
		// for each
		for(Object l:ll)
		{
			System.out.println(l);
		}
		
		// listIterator

		ListIterator li = ll.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
	}

}
