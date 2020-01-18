package collections;

import java.util.*;

public class SetDemo {
	public static void main(String[] args) {
		Set s=new HashSet();
		s.add(1);
		s.add(2);
		s.add(3);
		s.add('a');
		s.add("abhi");
		System.out.println(s);//[random print]
		//in a set insertion order is not preserved.
		Iterator itr=s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
