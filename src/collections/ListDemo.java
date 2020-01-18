package collections;
import java.util.*;
public class ListDemo {

	public static void main(String[] args) {
		
		List<Integer> l1=new ArrayList<Integer>();

		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		l1.add(5);
		l1.add(6);
		
		
		Iterator<Integer> itr=l1.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
			
		}
		
		for(int x:l1) {
			System.out.println(x);
			
		}
		

	}

}
