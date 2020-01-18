package collections;
import java.util.*;

public class demoIterator {

	public static void main(String[] args) {
	
		List<String> l=new LinkedList<String>();
		l.add("red");
		l.add("blue");
		l.add("orange");
		l.add("green");
		l.add("black");
		l.add("white");
		
		Iterator<String> itr=l.iterator();
		while(itr.hasNext()) {
			String s=(String)itr.next();
			System.out.println(s);
		}
		
	}

}
