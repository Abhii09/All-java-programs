package pattern;

public class Pattern4 {

	public static void main(String[] args) {
		int i,j,k;
		int n=9;
		for(i=0;i<n;i++) {
			for(j=0;j<=n-i;j++) {
				System.out.print("* ");
			}
			for(k=1;k<=i*2-1;k++) {
				System.out.print(" ");
			}
			for(int l=n-i;l>=0;l--)
			{
				if(l!=i)
				System.out.print("* ");
			}
			
			System.out.println();
		}
	}
}


/*
 

* * * * * * * * *  
* * * *   * * * * 
* * *       * * * 
* *           * * 
*               *
               

*/