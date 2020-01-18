package com;
public class Encapsulation {
	
	public static void main(String[] args) {
		Student s1=new Student();
		s1.setroll(10);
		s1.setname("Abhi");
		s1.setaddress("Talbid");
		
		System.out.println(s1.getroll());
		System.out.println(s1.getname());
		System.out.println(s1.getAddress());
	}
}
