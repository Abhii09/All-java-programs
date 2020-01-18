package collections;

import java.util.*;

public class TreesetDemo {
	public static void main(String[] args) {
		
		TreeSet t=new TreeSet();
		t.add(1);
		t.add(2);
		t.add(5);
		t.add(3);
		t.add(4);
	//	t.add(null);//NullPointerException is there
		System.out.println(t);//data display in sorting order.
		
		Iterator i=t.iterator();
		while (i.hasNext()) {
			
			System.out.println(i.next());
			
		}
	}

}
