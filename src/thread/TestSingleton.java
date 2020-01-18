package thread;

public class TestSingleton {
	
	public static void main(String[] args) {
		
		SingletonClass s=SingletonClass.single();
		SingletonClass s2=SingletonClass.single();
		
		 s.a=(s.a).toUpperCase();
		System.out.println(s.a);
		System.out.println(s2.a);
		
		s2.a=(s2.a).toLowerCase();
		System.out.println(s2.a);
		System.out.println(s.a);
		
		
	}

}
