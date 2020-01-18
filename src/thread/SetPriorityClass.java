package thread;

public class SetPriorityClass extends Thread {
	public void run() {
		int i,j,k;
		int n=5;
		int m=4;
		for(i=0;i<n;i++) {
			for(j=0;j<m;j++) {
				System.out.print(" ");
							
			}
			for(k=0;k<=i;k++) {
				System.out.print("* ");
			}m--;
			
			System.out.println();
			
		}
		
	}

}
