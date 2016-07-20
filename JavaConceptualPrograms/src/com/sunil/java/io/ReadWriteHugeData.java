package com.sunil.java.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class ReadWriteHugeData {
	
	
public static void main(String[] args) {
		
	
	
	//System.out.println(countRecords("C:\\testFile.csv"));		
	
   //ReadWriteHugeData.copyData("C:\\testFile.csv", "c:/output.csv");
	
	//System.out.println(countRecords("C:\\output.csv"));	
		
	ReadWriteHugeData a=new ReadWriteHugeData();	
	a.wordCount("C:\\testFile.csv");
		
		
		
		//ReadWriteHugeData obj=new ReadWriteHugeData();
		
		//obj.wordCount("c:/input.txt", "c:/output.txt");
		
	}


public static long  countRecords(String path){	
	BufferedReader br=null;
	long counter=0;
	try {					
		
		br=new BufferedReader(new InputStreamReader(new FileInputStream(path)));
			 while(br.readLine() != null)
             {
				 counter++;
				//System.out.println(scan);
             }
			 br.close();
		 
		
		System.out.println("finifshed");
		
	} catch (IOException e) {			
		e.printStackTrace();
	}	
	finally {
		if (br != null) {
			try {
				br.close();
			} catch (IOException e) {

				System.err.println("Error closing the file : ");
				e.printStackTrace();
			}
		}
	}
	
	return counter;

}
	
	
	
	public void wordCount(String path1){
		String scan=null;
		String[] wordArray;
		HashMap<String,Long> wordMap=new HashMap<>();
		try (//BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(new FileOutputStream(path2)));				 
				BufferedReader br1=new BufferedReader(new InputStreamReader(new FileInputStream(path1)));				
				){	
					 
					long startTime=new Date().getTime();	
					while((scan=br1.readLine()) != null)
		             {
						 //System.out.println(scan);
						 wordArray=scan.split(" ");
						 for(String s:wordArray)
						 {
							 
							 //System.out.println(s);
							 wordMap=processWord(s,wordMap);					
						 }
		             }
					
					long endTime=new Date().getTime();					
					System.out.println("Total time took (minute)="+ (endTime - startTime)/60000.0);
				 
					 //System.out.println(wordMap.size());
					System.out.println("=============================================");
					
					//Sorting
					List<Entry<String, Long>> list=new ArrayList<>(wordMap.entrySet());					
					Collections.sort(list, new Comparator<Map.Entry<String, Long>>() {
						public int compare(Map.Entry<String, Long> o1,Map.Entry<String, Long> o2) {
							return (o2.getValue()).compareTo(o1.getValue());
							}}							
							);
					//Sorting ends
					
					 for(Map.Entry<String, Long> entry:list)
					 {
						 System.out.println(entry.getKey()+" = "+entry.getValue());
					 }
					br1.close();	 
			//bw.close();		
			System.out.println("finifshed");
		} catch (Exception e) {			
			e.printStackTrace();
		}
		
	}
	
	
	
	private HashMap<String,Long>  processWord(String str,HashMap<String,Long> wordMap)
	{
		
		try {		
			//System.out.println(str);
			if(wordMap.size()==0)
			{
				wordMap.put(str, new Long(1));
			}
			else
			{				
				if(wordMap.containsKey(str))
				{
					wordMap.put(str, wordMap.get(str).longValue()+1);
				}
				else
				{
					wordMap.put(str, new Long(1));
					//System.out.println(str);
				}			
			}
	    		 
		}catch (Exception e) {
		    //exception handling left as an exercise for the reader
		}
		
		return wordMap;
		 
	}

	
	
	
	
public static void  copyData(String path1,String path2){	
		
		long startTime=new Date().getTime();
		try {		
			String scan=null;				
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(new FileOutputStream(path2)));			 
			BufferedReader br1=new BufferedReader(new InputStreamReader(new FileInputStream(path1)));
				 while((scan=br1.readLine()) != null)
	             {
					 bw.write(scan+"\n");
					//System.out.println(scan);
	             }
				 br1.close();
			  
			 bw.close();		
			System.out.println("finifshed");
			long endTime=new Date().getTime();
			
			System.out.println("Total time took"+ (endTime - startTime));
			
		} catch (Exception e) {			
			e.printStackTrace();
		}
		

	
	}
	
}
