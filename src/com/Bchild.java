package com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.FileAlreadyExistsException;

 public class Bchild extends AParent {
	
	@SuppressWarnings("null")
	public void m1ex() throws Exception
	{
		System.out.println("Bchild m1 method");
      String abc=null;
		
		if(abc.equals(null))
			 System.out.println("is equal");
		 else
			 System.out.println("not equal");
		
	}
	//checked exception using throw keyword.
	public void m2ex() throws FileNotFoundException
	{
		System.out.println("throw m2ex");
		InputStream input = new FileInputStream("c:\\data\\input-text.txt");
	}


}
