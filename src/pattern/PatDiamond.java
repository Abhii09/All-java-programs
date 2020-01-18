package pattern;

public class PatDiamond {
	public void diamond(int n,int m) {
		int i,j,k;
		
		for(i=1;i<=n;i++){
			
			for(j=0;j<=m;j++){
				System.out.print(" ");
			}
			m--;
			
			for(k=0;k<i;k++){
				System.out.print("* ");
			}
			System.out.println();
		}
		
		m=1;
		for(i=1;1<=n;i++) {
			
		for(j=1;j<=m;j++)
		{
			System.out.print(" ");
			
		}
		m++;
		for(k=0;k<n-1;k++) {
			System.out.print("* ");
		}n--;
		System.out.println();
		}
		
	}

	public static void main(String[] args) {
		int n=5;
		int m=3;
		PatDiamond pd=new PatDiamond();
		pd.diamond(n, m);
	}
}//not complete.
/* 
      *
     * *
    * * *
   * * * * 
  * * * * *
   * * * *
    * * *
     * * 
      *
 */