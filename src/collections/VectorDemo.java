package collections;

import java.util.*;

public class VectorDemo {

	public static void main(String[] args) {
		List<String> l1=new Vector<String>();
		l1.add("red");
		l1.add("yellow");
		l1.add("Green");
		l1.add("blue");
		l1.add("black");
		
		System.out.println(l1);
		

		
		
		Iterator<String> itr=l1.iterator();
		while (itr.hasNext()) {
			System.out.println("color is: "+itr.next());
			
		}
		
		 
	}
}
