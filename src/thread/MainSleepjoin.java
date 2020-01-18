package thread;

public class MainSleepjoin {

	public static void main(String[] args) {
		TestSleepJoin ts=new TestSleepJoin();	
		
		ts.start();
		
		try {
			ts.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		TestSleepJoin ts2=new TestSleepJoin();	
		ts2.start();

		
		
		TestSleepJoin ts3=new TestSleepJoin();	
		ts3.start();
		
		Thread.yield();
		
		TestSleepJoin ts4=new TestSleepJoin();	
		ts4.start();
		
		
	}
}
