package com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

//handling exception using try and catch.
public class TryException {

	public static void main (String[] args) {
		
		System.out.println("main start");
		try {
			System.out.println("try--start");
			int x=10/0;
			System.out.println("try--end"+x);
			InputStream input = new FileInputStream("c:\\data\\input-text.txt");
		}
		
		catch (ArrayIndexOutOfBoundsException e) {
	
			/*	for(int i=1;i<5;i++) {
				System.out.println(i);
			}*/
			
			System.out.println(e);//exception will be show.
		}
		catch(FileNotFoundException e) {
			System.out.println(e);
		}
		catch (RuntimeException e) {
	
		}
		System.out.println("main end");
		
}
}
