package thread;

public class TestSleepJoin extends Thread {
	public void run() {
		for(int i=0;i<5;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	
	}

	
}


