package thread;

public class RunThread {
	public static void main(String[] args) {
		Mythreadclass myt=new Mythreadclass();
		myt.start();
		Mythreadclass myt2=new Mythreadclass();
		myt2.start();

	}

}
