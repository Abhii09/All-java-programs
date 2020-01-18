package com;

public class Trycatch {
	public static void main(String[] args) {
		
		try {

			int[] x=new int[5];
			x[5]=10;
		}catch (ArithmeticException e) {
			System.out.println(e);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			}	
		catch (Exception  e) {
			System.out.println(e);
		}
		
		
		
		
	}

}
