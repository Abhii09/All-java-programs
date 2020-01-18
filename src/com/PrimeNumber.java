package com;

public class PrimeNumber {

	public static void main(String[] args) {
		int num=31;
		boolean flag=false;
		
		for(int i=2;i<=num/2;++i) {
			
			if(i%num==0) {
			  
				flag =true;
				break;
			}
		}
			if(!flag) {
				System.out.println("the number is prime:"+num);
			}
			else {
				System.out.println("the number is not prime");
			}
		
	}
}
