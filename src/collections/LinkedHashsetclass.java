package collections;

import java.util.*;

public class LinkedHashsetclass {
	public static void main(String[] args) {
		
		Set s=new LinkedHashSet();
		s.add(1);
		s.add(1);
		s.add(2);
		s.add(3);
		s.add('a');
		s.add("abhi");
		System.out.println(s);//duplicate is not accepted and insertion order is preserved.
		
	}

}
