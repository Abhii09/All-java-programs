package pattern;

public class Pattern2 {
	public void trangle(int n,int m) {
		int i,j;
		for(i=0;i<=n;i++) {
		
			for(j=0;j<=m;j++) {
			
			System.out.print("*");
			
			}
			m--;
			System.out.println();
		}
	}
	
	public static void main(String[] args)
	{
		int n=5;
		int m=5;
		Pattern2 p2=new Pattern2();
		p2.trangle(n,m);	
	}

}
