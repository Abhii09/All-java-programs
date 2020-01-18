package com;

public class ThrowOverriding {

	public static void main(String[] args) {
	
		Bchild c=new Bchild();
		try {
			c.m1ex();
		}
		catch (Exception e) {
			System.out.println("exception is:"+e);
		}
		finally {
			System.out.println("finally main");
		}
		
		//checked exception call
		try {
			c.m2ex();
		}
		catch(Exception e) 
		{
			System.out.println(e);
		}
		
		
		
		
	}

}
