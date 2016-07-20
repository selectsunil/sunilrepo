package com.sunil.java.resources;

public class Employee  {
	
	private String empId;
	private String empName;
	private int Salary;
	

	
	
	public Employee(String empId, String empName, int salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		Salary = salary;
	}
	
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}

	
	
	

}
