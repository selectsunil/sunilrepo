package com.sunil.java.basics;

public class AutoBoxing {

	public static void main(String[] args) {
		Integer io=3;
		int ip=7;
		
		System.out.println("IntObject= "+io);
		System.out.println("IntPremitive= "+ip);
		
		int temp;
		temp=ip;
		
		
		//swap
		ip=io; //Object to primitive AutoUnbox
		io=temp;//primitive to Object Autobox
		
		System.out.println("IntObject= "+io);
		System.out.println("IntPremitive= "+ip);
		
		
		
		

	}

}
