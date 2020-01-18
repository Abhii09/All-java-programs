package com;

//we can throw the parent class exception and cache same or child will throw and then catch parent. 
public class Throwstry {
	
	@SuppressWarnings("null")
	public void m1() throws NullPointerException
	{
		String abc=null;
		
		if(abc.equals("abc"))
			 System.out.println("is equal");
		 else
			 System.out.println("not equal");
		
		
				
	}
	public static void main(String[] args) {
		Throwstry th=new Throwstry();
		
		try {
		th.m1();
		System.out.println("try");
		}catch(Exception e)
		{
			System.out.println("exception is "+e);
		}
		finally {
			System.out.println("finally block");
		}
	}

}
