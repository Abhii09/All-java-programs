package Map;
import java.util.IdentityHashMap;
import java.util.*;

public class LinkedHashSetClass {

	public static void main(String[] args) {
		
		IdentityHashMap lm=new IdentityHashMap();
		Integer i=new Integer(10);
		Integer i2=new Integer(10);
		
		lm.put(i,"abhi");
		lm.put(i2,"abhishek");
		System.out.println(lm);
		//the keys are seam it is not duplicate its reference is different.
	}

}
