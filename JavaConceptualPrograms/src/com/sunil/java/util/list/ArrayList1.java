package com.sunil.java.util.list;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<>();
		a.add(-1);
		a.add(23);
		a.add(122);
		a.add(213);
		
		System.out.println(a);
		
		int i=0;
	    while(i<a.size())
	        if (a.get(i) < 0) 
	            a.remove(i);
	        else
	            i++;
	    
	    System.out.println(a);
	}

}
