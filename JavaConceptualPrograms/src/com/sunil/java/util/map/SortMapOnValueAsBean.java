package com.sunil.java.util.map;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;



import com.sunil.java.resources.*;


class EntryEmpSalComparator implements Comparator<Map.Entry<String, Employee>>{
	@Override
	public int compare(Map.Entry<String, Employee> arg0, Map.Entry<String, Employee> arg1) {		
				return arg0.getValue().getSalary() - arg1.getValue().getSalary();
	}
	
	
}

class EntryEmpNameComparator implements Comparator<Map.Entry<String, Employee>>{
	@Override
	public int compare(Map.Entry<String, Employee> arg0, Map.Entry<String, Employee> arg1) {		
				return arg0.getValue().getEmpName().compareTo(arg1.getValue().getEmpName());
	}
	
}

class EntryEmpIdComparator implements Comparator<Map.Entry<String, Employee>>{
	@Override
	public int compare(Map.Entry<String, Employee> arg0, Map.Entry<String, Employee> arg1) {		
				return arg0.getValue().getEmpId().compareTo(arg1.getValue().getEmpId());
	}
	
}

public class SortMapOnValueAsBean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Map<String,Employee> map=new HashMap<>();
		
		map.put("emp2",new Employee("2","Chandra",50000));
		map.put("emp1",new Employee("1","Dambaru",20000));		
		map.put("emp3",new Employee("3","Abhishekh",40000));
		map.put("emp4",new Employee("4","Biswakarma",40000));
		
		System.out.println("Before Sorting");
		System.out.println("----------------------------------");		
		printMap(map);
		
		System.out.println("Sorting Value By Sal");
		System.out.println("----------------------------------");		
		printMap(sortValue(map,"sal"));
		
		System.out.println("Sorting Value By Name");
		System.out.println("----------------------------------");		
		printMap(sortValue(map,"name"));
		
		System.out.println("Sorting Value By Id");	
		System.out.println("----------------------------------");
		printMap(sortValue(map,"id"));
		
	}
	
   

	public static void printMap(Map<String,Employee> map){
		
		for(Entry<String,Employee> entry : map.entrySet())
		{
		   System.out.println("Key="+entry.getKey()+"                       Value.Id="+entry.getValue().getEmpId()+"  Value.Name="+entry.getValue().getEmpName()+"  Value.Sal="+entry.getValue().getSalary());
	    }
		
	}
	

	
	
	 public static Map<String,Employee> sortValue(Map<String,Employee> map,String sortBy){
		 
		 List<Map.Entry<String, Employee>> list=new ArrayList<>(map.entrySet());
		 
		 switch(sortBy)
		 {
		 
		 case "name":
			 Collections.sort(list,new EntryEmpNameComparator() );
			 break;
		 case "sal":
			 Collections.sort(list,new EntryEmpSalComparator() );
			 break;
		 default:
			 Collections.sort(list,new EntryEmpIdComparator() );
			 break;
		
		 }
		 
		 Map<String,Employee> sortedMap=new LinkedHashMap<>();
		 for(Map.Entry<String,Employee> entry:list){
			 sortedMap.put(entry.getKey(), entry.getValue());
		 }
		 
		 return sortedMap;
		
	}

		
}
