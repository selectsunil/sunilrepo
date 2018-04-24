package com.sunil.java.v8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ScannerApi {
	
	public static void main(String args[]) throws IOException
{
			/*  BufferedReader br = new BufferedReader(new
			  InputStreamReader(System.in));
			
			  System.out.println("Enter an integer");
			  int a = Integer.parseInt(br.readLine());
			
			  System.out.println("Enter a String");
			  String b = br.readLine();
			
			  System.out.printf("You have entered:- " + a +
			                    " and name as " + b);
			  */
			  
			  //After java 8
			  
		
			  
		         Scanner scn = new Scanner(System.in);

		         System.out.println("Enter an integer");
		         int a1 = scn.nextInt();

		         System.out.println("Enter a String");
		         String b1 = scn.nextLine();

		         System.out.printf("You have entered:- "
		                 + a1 + " " + "and name as " + b1);
		         
		         scn.close();

}
	
	
	

}
