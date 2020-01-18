package Map;

import java.util.*;

public class TreemapClass {
	
	public static void main(String[] args) {
		
		TreeMap t=new TreeMap();
		t.put(1, "xxx");
		t.put(2, "aaa");
		t.put(4, "sss");
		t.put(3, "fff");
		t.put(5, "zz");
		t.put(6, "ooo");
		
		System.out.println(t);//{1=xxx, 2=aaa, 3=fff, 4=sss, 5=zz, 6=ooo} default natural sorting 
	
	
		TreeMap t2=new TreeMap(new TreeMapComporetor());
		t2.put("xxx",2);
		t2.put("aaa",1);
		t2.put("sss",3);
		t2.put("fff",4);
		t2.put("zz",6);
		t2.put("ooo",5);
		System.out.println(t2);
	
	}

}
