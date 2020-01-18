package com;
//childB class have two same method of parentA 
public class ChildB extends ParentA {
	public void m1() {
		System.out.println("ChildB m1 method");
	}
	
	public String m2(int a) {
		System.out.println("childB m2 method"+a);
		return null;
	}
	
	public void m3(int b) {
		System.out.println("parentA m1 method"+b);
	}
	
}
