package collections;

import java.util.TreeSet;

public class TreeSetClass {

	public static void main(String[] args) {
		
		TreeSet t1=new TreeSet(new CompareTry());
		t1.add(10);
		t1.add(0);
		t1.add(12);
		t1.add(30);
		t1.add(14);
		t1.add(15);
		System.out.println(t1);
	}

}
