package thread;

public class Testyield {

	public static void main(String [] args) {
		
		DemoYield dy=new DemoYield();
		dy.start();
		
		DemoYield dy1=new DemoYield();
		dy1.start();
		dy1.setPriority(6);
					
		
		for(int i=0;i<3;i++) {
			Thread.yield();
			System.out.println(Thread.currentThread().getName()+"is running main");
		}
	
		
	}
}
