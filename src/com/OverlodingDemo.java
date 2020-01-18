package com;
//overloading seam name different parameter will be pass
public class OverlodingDemo {
	public void add() {
		System.out.println("Add");
		
	}
	public void add(int d,int e) {
		int c=d+e;
		System.out.println("addition is "+c);
			
	}
	public void add(String x, String y) {
		String z=x+y; 
		System.out.println("Adition is:"+z);
	}
	
	public void add(float x, float y) {
		float z=x+y; 
		System.out.println("Adition is:"+z);
		
	}
	public static void main(String[] args) {
		
		OverlodingDemo ov=new OverlodingDemo();
		ov.add();
		ov.add(10,20);
		ov.add("Abhishek ","chavan");
		ov.add(15,20);
		
	}

}
