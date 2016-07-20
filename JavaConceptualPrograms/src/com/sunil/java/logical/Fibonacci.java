package com.sunil.java.logical;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO print 1,1,2,3,5,8......
		
		int a=0,b=1,c;
		System.out.print(1+" ,");
		for(int i=0;i<=10;i++)
		{
						
			c=a+b;
			
			System.out.print(c+" ,");
			
			a=b;b=c;		
			
		}

	}

}
