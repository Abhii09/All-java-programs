package com;


public class FinallyDemo {
	
	public static void main(String[] args) {
		int x = 0;
		System.out.println("main strat");
		try {
			int a=10/x;
				System.out.println(a);
		}catch(Exception e)
		{
			System.out.println(e);
		}
		//when IoException occur then finally block dose not print. 
	finally {
			System.out.println("finally block");
		}
		
		

		//we cannot write only finally block in our code, compulsory write a try block.
		
		try {
		
		}
		finally {
			System.out.println("finally block2");
		}
	
	}
	
	

}
