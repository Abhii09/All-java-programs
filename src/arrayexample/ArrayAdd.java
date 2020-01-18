package arrayexample;
import java.util.Scanner;

//array addition from user input.
public class ArrayAdd {
	
	public static void main(String[] args) {
		
		long sum=0;
		
		Scanner obj=new Scanner(System.in);
		
		System.out.print("enter a nubmer:");
		
		int n = obj.nextInt();
		
		int a[] = new int[n];
		
		System.out.println("enter array element:");		
		
		for(int i=0;i<n;i++) {
		
			a[i]=obj.nextInt();
			
			sum=sum+a[i];				
		}
		
		for(int temp:a)
		
		System.out.println(temp);
		
		System.out.println(sum);
	}
}