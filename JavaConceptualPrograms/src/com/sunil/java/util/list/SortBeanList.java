package com.sunil.java.util.list;

import com.sunil.java.util.map.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.sunil.java.resources.Employee;

class EmpSalComparatorForList implements Comparator<Employee>{
	@Override
	public int compare(Employee e1, Employee e2) {
				//return e1.getSalary()-e2.getSalary();//Default Ascending Order
				//return e2.getSalary()-e1.getSalary();//Descending order
				
				return Integer.compare(e1.getSalary(), e2.getSalary());
				
				//Note:Need to find out why this impl removes duplicate records
				
	}
	
}

public class SortBeanList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> list=new ArrayList<Employee>();
		list.add(new Employee("2","Chandra",50000));
		list.add(new Employee("1","Dambaru",20000));	
		list.add(new Employee("3","Abhishekh",40000));
		list.add(new Employee("4","Biswakarma",40000));
		
		//Printing  List
		System.out.println("Printing Unsorted List");
		System.out.println("-----------------------------------");
		for(Employee s:list){
			System.out.println("empId="+s.getEmpId()+" empName="+s.getEmpName()+" empSal="+s.getSalary());
		}
		
		//Sorting...
		
		//Collections.sort(list,new EmpSalComparatorForList()); //Comparator defined separately
		
		Collections.sort(list,new Comparator<Employee>(){     //Comparator defined on the fly - anonymous class
			
			public int compare(Employee e1, Employee e2) {
				//return e1.getSalary()-e2.getSalary();//Default Ascending Order
				//return e2.getSalary()-e1.getSalary();//Descending order
				
				return e1.getEmpName().compareTo(e2.getEmpName()); //sorting by empName
			}
		});
		
		//Printing sorted List
		System.out.println("Printing sorted List");
		System.out.println("-----------------------------------");
		for(Employee s:list){
			System.out.println("empId="+s.getEmpId()+" empName="+s.getEmpName()+" empSal="+s.getSalary());
		}

	}

}
