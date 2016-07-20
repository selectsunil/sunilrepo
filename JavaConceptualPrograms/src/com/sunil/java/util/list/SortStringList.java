package com.sunil.java.util.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortStringList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list=new ArrayList<String>();
		list.add("Amit");
		list.add("Dhrub");	
		list.add("Charu");
		list.add("Bhubaneswar");
		
		
		Collections.sort(list);
		
		//Printing List
		System.out.println("Ascending ....");
		System.out.println("====================");
		for(String s:list){
			System.out.println(s);
		}
		System.out.println();
		//Descending 
		
		Collections.sort(list, new Comparator<String>(){
			public int compare(String s,String s1){
				
				return s1.compareTo(s);
				
			}
		});
		
		//Printing List
		System.out.println("Descending ....");
		System.out.println("====================");
				for(String s:list){
					System.out.println(s);
				}
		
		
		

	}

}
