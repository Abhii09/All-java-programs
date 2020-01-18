package thread;

public class TestSetPriority {
	public static void main(String[] args) {
		
		SetPriorityClass st1=new SetPriorityClass();
		st1.setPriority(Thread.MIN_PRIORITY);
		System.out.println(st1.getPriority());
		st1.start();
								
		SetPriorityClass st=new SetPriorityClass();
		st.setPriority(Thread.NORM_PRIORITY);
		System.out.println(st.getPriority());
		st.start();
		
		SetPriorityClass st2=new SetPriorityClass();
		st2.setPriority(Thread.MAX_PRIORITY);
		System.out.println(st2.getPriority());
		st2.start();
		
		
		SetPriorityClass st3=new SetPriorityClass();
		st3.setPriority(9);
		System.out.println(st3.getPriority());
		st3.start();
		
		
		
		
	}

}
