package collections;

import java.util.*;

public class CompareTry implements Comparator{

	public int compare (Object o1,Object o2) {
		Integer i1=(Integer)o1;
		Integer i2=(Integer)o2;
		
		//return 0;//[10]
		//return i1.compareTo(i2);//[0,10,20,14,15,30]
		return -i1.compareTo(i2);//[30,15,14,20,10,0]
		//return i2.compareTo(i1);//[30,15,14,20,10,0]
		//return -i2.compareTo(i1);//[0,10,12,14,15,30]
		//return +1;[10,0,12,30,14,15]
		//return -1;//[15,14,30,12,0,10]
	}
	
}
