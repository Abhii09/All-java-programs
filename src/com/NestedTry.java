package com;

public class NestedTry {

	public static void main(String[] args)
	{
		System.out.println("Main start");
		try {
			System.out.println("1 try");
			
			try {
				System.out.println("inside 1 try");
			int[] x=new int[5];
			x[5]=10;
			
			}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			}
			finally {
				System.out.println("This is inside 1st finally block");
			}
			
			try {
				System.out.println("inside 2 try");
				int x=10/0;
				System.out.println(x);			
				
			}catch(ArithmeticException ex) {
				System.out.println(ex);
			}
			finally {
				System.out.println("This is inside 2nd finally block");
				
			}
			
						
		}catch (Exception exc) {
			System.out.println(exc);
		}
		finally {
			System.out.println("final finally block");
		}
		
		
		
	}
}
