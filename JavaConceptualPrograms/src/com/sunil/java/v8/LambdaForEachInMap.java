package com.sunil.java.v8;

import java.util.HashMap;
import java.util.Map;

public class LambdaForEachInMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, Integer> items = new HashMap<>();
		items.put("A", 10);
		items.put("B", 20);
		items.put("C", 30);
		items.put("D", 40);
		items.put("E", 50);
		items.put("F", 60);
		
		//Before Java 8
		for (Map.Entry<String, Integer> entry : items.entrySet()) {
			System.out.println("Item : " + entry.getKey() + " Count : " + entry.getValue());
		}
		
		//After java 8
		System.out.println("After Java 8");
		items.forEach((k,v)->System.out.println("Item : " + k + " Count : " + v));
		
		items.forEach((k,v)->{
			if(k.equals("C")) {
				System.out.println("value of c is"+ v);
			}
		});



	}

}
