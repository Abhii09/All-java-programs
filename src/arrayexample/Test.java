package arrayexample;

import java.util.Arrays;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 System.out.println("enter array size:");
		int[] a=new int[sc.nextInt()];
		
		for(int i=0;i<a.length;i++)
			{
			System.out.println("enter "+(i+1)+" number :");
			a[i]=sc.nextInt();
		}
		
		String stringArr = Arrays.toString(a); 
		  
        // print the String representation 
        System.out.println("Array: " + stringArr); 
		
	}

}
