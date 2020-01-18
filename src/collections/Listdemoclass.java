package collections;
import java.util.*;


public class Listdemoclass {

	public static void main(String[] args) {
		
		Student s=new Student();
		s.Setrollno(1);
		s.Setname("abhi");
		Student s2=new Student();
		s2.Setrollno(2);
		s2.Setname("alpesh");
		Student s3=new Student();
		s3.Setrollno(3);
		s3.Setname("sandy");
		Student s4=new Student();
		s4.Setrollno(4);
		s4.Setname("Abhijeet");
		
		List<Student> l1=new ArrayList<Student>();
		l1.add(s);
		l1.add(s2);
		l1.add(s3);
		l1.add(s4);
		
		Iterator<Student> itr=l1.iterator();
		while(itr.hasNext()) {
			Student sd=(Student)itr.next();
			System.out.println(sd.ToString());
		}
	//time 9:30Am to 11AM because of some errors and not converting in string,its printing Hashcode. 	
	}

}
