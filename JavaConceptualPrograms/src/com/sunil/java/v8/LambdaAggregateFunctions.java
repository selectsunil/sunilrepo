package com.sunil.java.v8;

import java.util.ArrayList;
import java.util.List;

public class LambdaAggregateFunctions {

	public static void main(String[] args) {

		List<Integer> items = new ArrayList<>();
		items.add(40);
		items.add(28);
		items.add(34);
		items.add(10);
		items.add(83);
		
		int sum=0;
		
		for(int i:items) {
			sum+=i;
		}
		
		System.out.println(sum);
		
		
		//After java 8
		System.out.println("After java 8");
		
		int sum1 =items.stream().mapToInt(Integer::intValue).sum();
		
		System.out.println(sum1);



	}

}
