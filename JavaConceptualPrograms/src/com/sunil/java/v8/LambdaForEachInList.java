package com.sunil.java.v8;

import java.util.ArrayList;
import java.util.List;

public class LambdaForEachInList {

	public static void main(String[] args) {
		List<String> items = new ArrayList<>();
		items.add("A");
		items.add("B");
		items.add("C");
		items.add("D");
		items.add("E");
		
		for(String s:items) {
			System.out.println(s);
		}
		
		System.out.println("After jave 8");
		
		items.forEach(s->System.out.println(s));
		
		items.forEach(i->{
			if(i.equals("C")) {
				System.out.println("We are at C");
			}
		});

	}

}
