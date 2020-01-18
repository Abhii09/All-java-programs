package collections;

import java.util.Enumeration;
import java.util.Vector;


public class EnumarationDemo {
	public static void main(String[] args) {
		Vector<Character> v=new Vector<Character>();
		v.add('a');
		v.add('b');
		v.add('h');
		v.add('i');
		v.add('s');
		v.add('h');
		v.add('e');
		v.add('k');
		System.out.println(v);//display list like [a,b,h,i,s,h,e,k,]
		
		//but we wont to one by one element print then we go for enumeration.
		
		Enumeration<Character> en=v.elements();
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
		
		
		//only two methods we can use enumerator. we can  not add remove it is only for vector. 
	}

}
