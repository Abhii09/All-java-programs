package collections;
import java.util.*;

public class SetDemoClass {
	
	public static void main(String[] args) {
	
		EmployeeClass e1=new EmployeeClass();
		e1.SetempID(101);
		e1.Setname("Abhi");
		EmployeeClass e2=new EmployeeClass();
		e2.SetempID(102);
		e2.Setname("sandy");
		EmployeeClass e3=new EmployeeClass();
		e3.SetempID(103);
		e3.Setname("alpesh");
		
		Set<EmployeeClass> s=new HashSet<EmployeeClass>();//hashset insertion order not preserved.
		s.add(e1);
		s.add(e2);
		s.add(e3);

		Set<EmployeeClass> ls=new LinkedHashSet<EmployeeClass>();//hashset insertion order not preserved.
		ls.add(e1);
		ls.add(e2);
		ls.add(e3);
		
		//now data stored in linked hashSet.
		
		
		Iterator<EmployeeClass> itl=s.iterator();
		while(itl.hasNext()) {
			EmployeeClass emp2=(EmployeeClass)itl.next();
			System.out.println(emp2.ToString());
		}
		
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		
		Iterator<EmployeeClass> it=s.iterator();
		while(it.hasNext()) {
			EmployeeClass emp=(EmployeeClass)it.next();
			System.out.println(emp.ToString());
		}
		
		
		
		
	}
	

}
