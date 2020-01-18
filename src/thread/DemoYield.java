package thread;

public class DemoYield extends Thread {

	public void run() {
		for(int i=0;i<3;i++) {
			System.out.println(Thread.currentThread().getName()+"is running");
		}
	}
}
