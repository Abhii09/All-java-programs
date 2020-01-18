package pattern;

public class Patterntrangle{
	
	public void trangle(int n) {
	
		int i,j;
		for(i=0;i<5;i++) 
		{
			for(j=0;j<=i;j++) {
				System.out.print("* ");
				
			}
			System.out.println();
		}	
		
	}
	public static void main(String[] args)
	{
		int n=5;
		Patterntrangle pt=new Patterntrangle();
		pt.trangle(n);
	}
	

}
