package collections;

import java.util.*;
import java.util.Iterator;

public class ListAdd {
	public static void main(String[] args){
		List<String> l1=new ArrayList<String>();
		
		l1.add("Abhi");
		l1.add("Chavan");
		
		System.out.println(l1);
		
		l1.add(1,"Anandrao"); // 1 is index of array list.
		System.out.println("Add value in list index 1:  "+l1);
		
		List<String> l2=new LinkedList<String>();
		
		l2.addAll(l1);

		l2.add("age"+" 24");  
		
		System.out.println("list 2:"+l2);
		
		
		Iterator<String> it=l2.iterator();
		while (it.hasNext()) {
			System.out.print(it.next()+" ");
			}
		System.out.print(".");
		
		
		l2.remove(3);
		System.out.println("Aftre removing in list");
		System.out.println(l2);
		
	}

}
