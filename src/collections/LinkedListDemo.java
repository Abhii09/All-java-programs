package collections;

import java.util.*;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		List<String> l1= new LinkedList<String>();

		l1.add("Abhishek");
		l1.add("Chavan");
		l1.add("talbid");
	
		System.out.println(l1);
		
		Iterator it= l1.iterator();

		System.out.println(it.next());
		while (it.hasNext()) {
			String i=(String)it.next();
			System.out.println(i);
			
		}
		
	}

}
