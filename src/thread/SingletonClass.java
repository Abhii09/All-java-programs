package thread;

public class SingletonClass {

	private static SingletonClass sc =null;
	public String a;
	private SingletonClass() 
	{
		a ="i am abhi.";
	}
	public static synchronized SingletonClass single() {
		synchronized (SingletonClass.class) {
			if(sc==null) {
				sc=new SingletonClass();
				
			}
		}
		return sc;
		
	}
	
}