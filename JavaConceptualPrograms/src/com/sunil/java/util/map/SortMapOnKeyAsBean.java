package com.sunil.java.util.map;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import com.sunil.java.resources.*;


class EmpSalComparator implements Comparator<Employee>{
	@Override
	public int compare(Employee e1, Employee e2) {
				//return e1.getSalary()-e2.getSalary();//Default Ascending Order
				//return e2.getSalary()-e1.getSalary();//Descending order
				
				return Integer.compare(e1.getSalary(), e2.getSalary());
				
				//Note:Need to find out why this impl removes duplicate records
				
	}
	
}

class EmpNameComparator implements Comparator<Employee>{
	@Override
	public int compare(Employee arg0, Employee arg1) {		
				return arg0.getEmpName().compareTo(arg1.getEmpName());
				//return arg1.getEmpName().compareTo(arg0.getEmpName());//Descending Order
	}
	
}

class EmpIdComparator implements Comparator<Employee>{
	@Override
	public int compare(Employee arg0, Employee arg1) {		
				return arg0.getEmpId().compareTo(arg1.getEmpId());
	}
	
}

public class SortMapOnKeyAsBean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Employee,String> map=new HashMap<>();
		Map<Employee,String> treemap=null;
		
		map.put(new Employee("2","Chandra",50000), "emp2");
		map.put(new Employee("1","Dambaru",20000), "emp1");		
		map.put(new Employee("3","Abhishekh",40000), "emp3");
		map.put(new Employee("4","Biswakarma",40000), "emp4");
		
		System.out.println("Before Sorting");
		printMap(map);
		System.out.println("Sorting Key By Sal");	
		treemap=new TreeMap<Employee,String>(new EmpSalComparator());		
		treemap.putAll(map);
		printMap(treemap);
		System.out.println("Sorting Key By Name");	
		treemap=new TreeMap<Employee,String>(new EmpNameComparator());		
		treemap.putAll(map);
		printMap(treemap);
		System.out.println("Sorting Key By Id");	
		treemap=new TreeMap<Employee,String>(new EmpIdComparator());		
		treemap.putAll(map);
		printMap(treemap);
		
	}
	
   

	public static void printMap(Map<Employee,String> map){
		
		for(Entry<Employee,String> entry : map.entrySet())
		{
		   System.out.println("Key.Id="+entry.getKey().getEmpId()+"  Key.Name="+entry.getKey().getEmpName()+"  Key.Sal="+entry.getKey().getSalary()+"               Value="+entry.getValue());
	    }
		
	}
	

	
	
	/* public static Map sortKeyById(){
		
	}
   public static Map sortKeyByName(){
		
	}*/
		
}
