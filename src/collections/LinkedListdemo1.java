package collections;

import java.util.*;

public class LinkedListdemo1 {

	public static void main(String[] args) {
		LinkedList<String> l1=new LinkedList<String>();
		l1.add("i am");
		l1.add("abhi");
		l1.add("chavan");
		l1.add("karad");
		l1.set(0, "This is");
		l1.add(0,"hii");
		l1.removeLast();
		l1.add("Null");
		System.out.println(l1.getFirst());//first element display
		System.out.println(l1.getLast());//last element display
		System.out.println(l1.get(2));//fourth no index value print in list
		System.out.println(l1);
		
		
	}

}
