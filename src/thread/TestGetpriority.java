package thread;

public class TestGetpriority {

	public static void main(String[] args) {
	
		Getpriorityclass gt=new Getpriorityclass();
		Getpriorityclass gt1=new Getpriorityclass();
		
		gt.start();
		System.out.println("priority"+gt1.getPriority());
		gt1.start();
		
	}
}
