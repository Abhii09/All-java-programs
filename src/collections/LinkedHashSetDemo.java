package collections;

import java.util.*;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		Set st=new LinkedHashSet(10);
		for(int i=0;i<10;i++) {
			st.add(i);
			st.add("Abhi");
			
		}
		System.out.println(st);
		System.out.println(st.size());
		
		Set st1=new HashSet( 15, (float) 0.10);//here 15 is size of Hashset and 0.75 is  load factor.
		for(int i=0;i<15;i++) {
			st1.add(i);
			st1.add("chavan");
			
		}
		System.out.println(st1);
		System.out.println(st1.size());
		
		//set one add in set 2 but here duplicate is not allowed so print only unique element.
		st1.addAll(st);
		System.out.println(st1);

	}

}
