package com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class AParent {
	
	
	@SuppressWarnings("null")
	public void m1ex() throws Exception
	{
      String xyz=null;
		
		if(xyz.equals("abc"))
			 System.out.println("is equal");
		 else
			 System.out.println("not equal");
		
	}
	public void m2ex() throws Exception
	{
		System.out.println("throw m2ex");
		InputStream input = new FileInputStream("c:\\data\\input-text.txt");
	}

	}
