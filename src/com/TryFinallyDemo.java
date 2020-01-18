package com;
//if try having a return statement then also finally block will execute first then return statement will pass to caller method 
public class TryFinallyDemo {
	
	public int m1(int a) {
		
	try{
		int x=10/2;
		
		System.out.println("try block start"+x);
	
		return x;
	
	}catch(Exception e)
	{
		System.out.println(e);
	}
	finally {
		System.out.println("Finally block");
	}
	return 0;
	
	
	

}
	public static void main(String[] args) {
		TryFinallyDemo t=new TryFinallyDemo();
		int a=t.m1(0);
		System.out.println(a);
		// System.out.println(t.m1());
	}
}