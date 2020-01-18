package collections;

public class EmployeeClass {
	private int EmpId;
	private String name;
	
	public void SetempID(int EmpId) {
		this.EmpId=EmpId;
		}
	public void Setname(String name){
		this.name=name;
		}
	
	String ToString() {
		return EmpId+"--"+name;
       }
	

}
