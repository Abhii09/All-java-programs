package com;

//using throws keyword we can give a chance to a caller method to handle the exception
public class Throwsdemo {
	
		public void m1() throws Exception //here throws keyword is used. and call the class b m2 method.
		{
			System.out.println("m1 throwdemo");
			B b=new B();
			try
			{
				b.m2();
			}catch(Exception e) {
				System.out.println(e);
			}
			try {
				int x=10/2;
				System.out.println(x);
			}catch(Exception e) {
				System.out.println(e);
			}
			
		}
	
	public class B{
		public void m2() {
			System.out.println("B--m2");
			int x=10/0;
			System.out.println("value is :"+x);
		}
		
	}
	public static void main(String[] args) {
		
		Throwsdemo t=new Throwsdemo();
		try
		{
			t.m1();//call m1 method.
			
			int[] x=new int[5];
			x[5]=10;
			System.out.println("value"+x[5]);
		}catch(Exception e) {
			System.out.println(e);
			System.out.println("catch end");
		}
		System.out.println("main end");
		
				
	}

}
