package Map;

import java.util.*;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap h=new HashMap();
		h.put(101, "Abhi");
		h.put(102,"Alpesh");
		h.put(103, "Sandy");
		
		System.out.println(h);//{101=Abhi, 102=Alpesh, 103=Sandy}
		
		Set s=h.keySet();
		System.out.println(s);//[101, 102, 103] only keys are printed.
		
		Collection c=h.values();
		System.out.println(c);//[Abhi, Alpesh, Sandy] only vlues are printed.
				
		Set s1=h.entrySet();
		System.out.println(s1);//[101=Abhi, 102=Alpesh, 103=Sandy] convert into set and show key value pare data
		
		Iterator itr=s1.iterator();
		while(itr.hasNext()) {
			Map.Entry m=(Map.Entry)itr.next();
			System.out.println(m); //individual key value show line by line
			
			System.out.println(m.getKey()+"..."+m.getValue());
			
			if(m.getKey().equals(101)) {
			
				System.out.println(m.setValue("Abhishek")); //set a value by given condition.				
		
			}
		}
		
		System.out.println(s1); //[101=Abhishek, 102=Alpesh, 103=Sandy]
		System.out.println(h); //{101=Abhishek, 102=Alpesh, 103=Sandy}
		
		
		
		
	}

}
