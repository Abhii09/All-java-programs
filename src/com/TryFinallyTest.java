package com;

public class TryFinallyTest {

@SuppressWarnings("finally")
public int  m2(int ab) {
	try {
		System.out.println("try start");
		int a=10;
		System.out.println("try before return");
		return a;
	}
	finally {
		System.out.println("finally");
		int a=20;
		return a;
	}
	}
	public static void main(String[] args) {
		TryFinallyTest t1=new TryFinallyTest();
		int a=t1.m2(0);
		System.out.println(a);
	}

}
