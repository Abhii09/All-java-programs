package Map;

import java.util.Hashtable;

public class HashtableClass {

	public static void main(String[] args) {
		
		Hashtable<Integer, String> h=new Hashtable<Integer, String>();
		h.put(11,"abhi");
		h.put(21,"abhishek");
		h.put(13,"abhidada");
		h.put(14,"theabhi");
		h.put(51,"abhireturns");
		h.put(16,"ekabhi");
		System.out.println(h);//order is depend on a HashCode.
		
		Hashtable<Temp, String> h2=new Hashtable<Temp, String>();
		h2.put(new Temp(11),"abhi");
		h2.put(new Temp(21),"abhishek");
		h2.put(new Temp(13),"abhidada");
		h2.put(new Temp(14),"theabhi");
		h2.put(new Temp(51),"abhireturns");
		h2.put(new Temp(16),"ekabhi");
		System.out.println(h2.toString());//order is depend on a HashCode.
		
		Hashtable<Temp, String> h3=new Hashtable<Temp, String>(25);
		h3.put(new Temp(11),"abhi");
		h3.put(new Temp(21),"abhishek");
		h3.put(new Temp(13),"abhidada");
		h3.put(new Temp(14),"theabhi");
		h3.put(new Temp(51),"abhireturns");
		h3.put(new Temp(16),"ekabhi");
		System.out.println(h3.toString());//order is depend on a HashCode.
		
		
	}
}
