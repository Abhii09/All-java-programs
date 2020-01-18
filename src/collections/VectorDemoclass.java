package collections;

import java.util.*;

public class VectorDemoclass {
	public static void main(String[] args) {
		Vector<Integer> v=new Vector<Integer>();
		
		v.add(100);
	for(int i=0;i<10;i++) {
		v.addElement(i);
	
	}
	System.out.println(v);
	System.out.println(v.capacity());
	System.out.println(v.size());
	
	Vector v1=new Vector(10,5);
	v1.add("2nd");v1.add("2nd");v1.add("2nd");v1.add("2nd");v1.add("2nd");v1.add("2nd");v1.add("2nd");
	v1.addAll(v);

	System.out.println(v1);
	System.out.println(v1.capacity());
	System.out.println(v1.size());
	
	}
	
	
	
	
	

}
