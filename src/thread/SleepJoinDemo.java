package thread;

public class SleepJoinDemo {
	public static void main(String[] args) {
		Mythreadclass1 m1=new Mythreadclass1();
		m1.start();
		try {
			m1.join();		//join is used for 
	      } 
		catch (Exception e)
		{
		System.out.println();
      	}
	
		Mythreadclass1 m2=new Mythreadclass1();
		m2.start();
	
		Mythreadclass1 m3=new Mythreadclass1();
		m3.start();
		
	}

}
