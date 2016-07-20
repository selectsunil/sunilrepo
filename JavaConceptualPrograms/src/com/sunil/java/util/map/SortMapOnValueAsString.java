package com.sunil.java.util.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class SortMapOnValueAsString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, String> unsortMap = new HashMap<String, String>();
		unsortMap.put("Z", "z");
		unsortMap.put("B", "b");
		unsortMap.put("A", "a");
		unsortMap.put("C", "c");
		unsortMap.put("D", "d");
		unsortMap.put("E", "e");
		unsortMap.put("Y", "y");
		unsortMap.put("N", "n");
		unsortMap.put("J", "j");
		unsortMap.put("M", "m");
		unsortMap.put("F", "f");
 
		System.out.println("Unsort Map......");
		printMap(unsortMap);
 
		System.out.println("\nSorted Map......");
		
		printMap(sortValues(unsortMap));
		
		

	}
	
	public static Map<String,String> sortValues(Map<String,String> map){
		
		
		// Convert Map to List
		Set<Entry<String, String>> set=map.entrySet();		
		List<Entry<String, String>> list=new ArrayList<Entry<String, String>>(set);
		
		//Collections.sort(list); This will not work as Map.Entry is not implements Comparable like String.here need to provide external Comparator
		
		// Sort list with comparator, to compare the Map values
		Collections.sort(list, new Comparator<Map.Entry<String, String>>() {
			public int compare(Map.Entry<String, String> o1,
                    Map.Entry<String, String> o2) {
				return (o1.getValue()).compareTo(o2.getValue());
				}}
			);
		
		
		// Convert sorted map back to a Map
				Map<String, String> sortedMap = new LinkedHashMap<String, String>();
				for (Map.Entry<String, String> entry:list) {					
					sortedMap.put(entry.getKey(), entry.getValue());
				}
		
		
		
		return sortedMap;
		
	}
	
	public static void printMap(Map<String, String> map) {
		for (Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println("Key : " + entry.getKey() 
                                      + " Value : " + entry.getValue());
		}
	}

}
