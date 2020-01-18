package thread;

public class Mythread  extends Thread{
	
	
	public void run() {
		Demo d=new Demo();
		d.m1();
	}

}
