package collections;
import java.util.*;

public class iteratorRemove {
	public static void main(String[] args) {
		
		List<Integer> l2=new ArrayList<Integer>();
		for(int i=0;i<10;i++) {
			l2.add(i);
		}
		System.out.println(l2);
		
		Iterator<Integer> itr=l2.iterator();
		while(itr.hasNext()) {
			int x=(int)itr.next();
		
			
			if(x %2!=0) {
				System.out.println(x);
			}
			else {
				itr.remove();//remove the element in list.
				}
		}
			System.out.println(l2);
			
			
		
		
	}

}
