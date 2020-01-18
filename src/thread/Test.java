package thread;

public class Test {
	public static void main(String[] args) {
		
		
		Mythread my=new Mythread();
		Mythread my2=new Mythread();
		my2.start();
		my.start();
		
		
	}

}
