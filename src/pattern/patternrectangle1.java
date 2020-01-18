package pattern;

public class patternrectangle1 {
	public void peramid(int n,int m) {
		
		
	int i,j,k;
	
	for(i=1;i<=n;i++) {
		for(j=0;j<=m;j++) {
			System.out.print(" ");
		}
		for(k=0;k<i;k++)
		{
			System.out.print("*");
		}
		m--;
		System.out.println();
		
	}
	}
	
	
	public static void main(String[] args) {
		int n=5;
		int m=3;
		patternrectangle1 pp=new patternrectangle1();
		pp.peramid(n, m);
	}
	

}
