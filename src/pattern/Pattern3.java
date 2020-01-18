package pattern;

public class Pattern3 {
	public static void main(String[] args) {
		int i,j;
		int n=5;
		int m=5;
		for(i=0;i<n;i++) {
			for(j=0;j<m;j++) {
				System.out.print("*");
				
			}m--;
			System.out.println();
		}
		
		for(i=2;i<n+1;i++)
		{
			for(j=0;j<i;j++) {
				System.out.print("*");
			}
		System.out.println();
		}
		
	
	
	}
	

}
