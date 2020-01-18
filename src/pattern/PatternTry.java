package pattern;


public class PatternTry {
	
	public void pat(int n) {
		
		int i, j;
		
		for(i=0;i<n;i++) {
		
		for(j=0;j<n;j++) {
			System.out.print("*");
		
		}

		System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int n=5;
		
		PatternTry p=new PatternTry();
		p.pat(n);
	}

}
