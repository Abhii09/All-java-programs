package com;

public class ThrowTest {
	
	public void agetest(int age) throws AgeInvalidException
	{
		if(age<=18) {
			AgeInvalidException e=new AgeInvalidException("please enter a valid age");
			throw e;
		}
	}
	public static void main(String[] args) {
		ThrowTest te=new ThrowTest();
			try {
				te.agetest(10);
			} catch (AgeInvalidException e) {
				System.out.println(e.getMessage());
			}
		
	}

}
