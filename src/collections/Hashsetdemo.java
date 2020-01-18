package collections;

import java.util.*;

public class Hashsetdemo {
	public static void main(String[] args) {
		System.out.println("it is a hashset so there is no insertion order presarved");
		Set st=new HashSet();
		for(int i=0;i<25;i++) {
			st.add(i);
			st.add("I am");
			
		}
		System.out.println(st);
		System.out.println(st.size());
		
		Set st1=new HashSet(10);
			for(int i=0;i<10;i++) {
				st1.add(i);
				st1.add("Abhi");
				
			}
			System.out.println(st1);
			System.out.println(st1.size());
			
			Set st2=new HashSet( 15, (float) 0.75);//here 15 is size of Hashset and 0.75 is  load factor. it is default.
			for(int i=0;i<15;i++) {
				st2.add(i);
				st2.add("chavan");
				
			}
			System.out.println(st2);
			System.out.println(st2.size());
			
			//set one add in set 2 but here duplicate is not allowed so print only unique element.
			st2.addAll(st);
			st2.addAll(st1);
			System.out.println(st2);
			


	}

	}


