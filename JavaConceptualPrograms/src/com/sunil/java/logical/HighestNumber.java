package com.sunil.java.logical;

import java.lang.reflect.Array;
import java.util.Arrays;

public class HighestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr={2,4,10,6,9,19,23,1,5,7};
		
		Arrays.sort(arr);		
		
			System.out.println(" Highest number is :"+arr[arr.length-1]);
			System.out.println(" Second Highest number is :"+arr[arr.length-2]);		
		
		for(int a:arr)
		{
			System.out.print(a+" ");
		}
		

	}

}
