package arrayexample;

import java.util.Scanner;

public class ArrayInput {
	
	

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.print("enter a name age sallary");
		
		
		String name=obj.nextLine();
		int age=obj.nextInt();
		double sallary=obj.nextDouble();
	
		System.out.println("name is:"+name);
		System.out.println("age is:"+age);
		System.out.println("sallary is:"+sallary);
		}
		

}
