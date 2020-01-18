package pattern;

public class patperamid2 {
	public void peramid(int n,int m) {
		int i,j,k;
		for(i=0;i<n;i++) {
			
			for(j=0;j<=i;j++)
			{
				System.out.print(" ");
			}
			
			for(k=0;k<m;k++) {
				System.out.print("* ");
			}
			m--;
			System.out.println();
			
		
		}
	
	}

	public static void main(String[] args) {
		int n=5;
		int m=5;
		patperamid2 pap=new patperamid2();
		pap.peramid(n, m);
	}
	
}


//  * * * * * 
//   * * * *
//    * * *
//     * * 
//      *

