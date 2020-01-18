package com;

public class TryCatchFinally {

	public static void main(String[] args) {
		System.out.println("main-start");
		try {
			int[] x=new int[5];
			x[5]=10;
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		
		}
		finally {
			System.out.println("this is finnaly block");
		}
		System.out.println("main_end");
		
		//without using catch block we can run the code using try and finally 
		//but after finally block execute then JVM will show exception.
		try {
			System.out.println("try start");
			int x=10/0;
			System.out.println(x);
		}
		finally {
			System.out.println("finally block 2");
		}
				
	}
	
}
