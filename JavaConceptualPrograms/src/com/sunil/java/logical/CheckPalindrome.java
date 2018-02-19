package com.sunil.java.logical;

public class CheckPalindrome {

	public static void main(String[] args) {
		String in="racecar";
		
		StringBuilder sb=new StringBuilder(in);
		
		if(in.equals(sb.reverse().toString()))
			System.out.println("it is a palindrome");
	}

}
