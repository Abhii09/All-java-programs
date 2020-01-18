package Map;

import java.util.*;

public class LinkdHashMapDemo {
	
	public static void main(String[] args){
		
		LinkedHashMap<Integer, String> h=new LinkedHashMap<Integer, String>();
		h.put(1, "Abhishek");
		h.put(6,"Alpesh");
		h.put(2, "Sandy");
		h.put(5, "Satish");
	
		System.out.println(h);//{1=Abhishek, 2=Sandy, 5=Satish, 6=Alpesh} insertion order is preserved.
		
		Set s=h.keySet();
		System.out.println(s);//[1, 2, 5, 6] only keys are printed.
		
		Collection c=h.values();
		System.out.println(c);//[Abhishek, Sandy, Satish, Alpesh]only vlues are printed.
				
		Set s1=h.entrySet();
		System.out.println(s1);//[1=Abhishek, 2=Sandy, 5=Satish, 6=Alpesh] convert into set and show key value pare data
			
			Iterator itr=s1.iterator();
			while(itr.hasNext()) {
			Map.Entry m=(Map.Entry)itr.next();
			System.out.println(m); //individual key value show line by line
			
			System.out.println(m.getKey()+"..."+m.getValue());
			
			if(m.getKey().equals(1)) {
		
			System.out.println(m.setValue("AbhishekDada")); //set a value by given condition.				
	
		}
	}
	
	System.out.println(s1); //[1=AbhishekDada, 6=Alpesh, 2=Sandy, 5=Satish]
	System.out.println(h); //{1=AbhishekDada, 6=Alpesh, 2=Sandy, 5=Satish}

	

}
	}

