package collections;

public class Student {
	private int rollno;
	private String name;
	
	public void Setrollno(int rollno) {
		this.rollno=rollno;
		}
	public void Setname(String name){
		this.name=name;
		}
	
	String ToString() {
		return rollno+"--"+name;
       }
	

	
}
