package com.sunil.java.v8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaForPipelineOperations {

	public static void main(String[] args) {
		List<String> items = new ArrayList<>();
		items.add("a1");
		items.add("a2");
		items.add("b1");
		items.add("c2");
		items.add("c1");
		items.add("C3");
		
		/*List<String> sitems = new ArrayList<>();
		for(String s : items) {
			if(s.startsWith("c")) {
				sitems.add(s.toUpperCase());
			}
		}
		
		Collections.sort(sitems, new Comparator<String>() {
       		public int compare(String s1, String s2) {
           		return s1.compareTo(s2);
        	}
    	});
		
		
		for(String s : sitems) {
			System.out.println(s);
		}
*/
		
		//After java 8
		
		System.out.println("After java 8");
		
		items.stream().filter(s->s.startsWith("c")).map(String::toUpperCase).sorted((a,b)->a.compareTo(b)).forEach(s->System.out.println(s));




	}

}
