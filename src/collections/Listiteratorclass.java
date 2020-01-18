package collections;
import java.util.*;
public class Listiteratorclass {

	public static void main(String[] args) {

		List<Integer> ll=new LinkedList<Integer>();
		for(int i=0;i<10;i++) {
			ll.add(i);
			
		}
		System.out.println(ll);
		System.out.println(ll.size());
		
		ListIterator<Integer> lt=ll.listIterator();
			//forward direction.
		System.out.println("Forword direction print but its bydefault :) ");
		while(lt.hasNext()) {
			int x=(int)lt.next();
			System.out.println(x);
			
		}
		System.out.println(lt.nextIndex());
	
	
		//backward direction

		System.out.println("Backword direction print");
		while(lt.hasPrevious()) {
		System.out.println(lt.previous());
		}
		
		System.out.println(lt.previousIndex());
		

	}

}
