package com.sunil.java.basics;
import java.util.*;
public class CollectionTest 
{
	
	public Map getTreeMap()
	{
		Map<Integer,String> m=null;
		try
		{
		
				m=new TreeMap<Integer,String>();
				m.put(new Integer(15),"sunil");
				m.put(new Integer(16),"sandeep");
				m.put(new Integer(18),"roma");
				m.put(new Integer(5),"rajesh");

				
		}
		catch (Exception e)
		{
			System.out.println("Error:"+e);
		}
		return m;
		
	}
	
	
	
	
	
	public static void main(String[] args) 
	{
		CollectionTest ct=new CollectionTest();
		Map mt=ct.getTreeMap();

		Set s=mt.keySet();
		Collection a=mt.values();

	System.out.println("values"+a.toString());

		System.out.println("value ="+mt.get(15));
		System.out.println("value ="+mt.get(18));
		System.out.println("value ="+mt.get(5));

		System.out.println("Hello World!");
	}
}
