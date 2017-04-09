package com.sunil.java.basics;

class ConstructorTestBase 
{
	ConstructorTestBase() 
	{
		System.out.println("I am in default Constructor of base");
		
		

	}
	ConstructorTestBase(int a,int b)
	{
		
		System.out.println("I am in parameter Constructor of base");
		//this();compilation error cos this and super must be the first statement

	}

	
}

public class ConstructorTest extends  ConstructorTestBase
{
	  String ConstructorTest() 
	{
		System.out.println("I am in method of sub class");//static ,synchronized and final is not allowed before the constructor
		return "Sunil";//when we use retuntype in a constructor that acts as a method
	}
	 ConstructorTest()
	{
		//this(3,4);compilation error recursive constuctor invocation
		super();
		System.out.println("I am in default Constructor of subclass");
		
	}
	ConstructorTest(int a,int b)
	{
		//this();compilation error recursive constuctor invocation
		
		System.out.println("I am in parameter Constructor of subclass");

	}

	public static void main(String[] args) 
	{
		
		ConstructorTest ct=new ConstructorTest(5,2);
		//ConstructorTest ct=new ConstructorTest();
		//System.out.println("constructor is called explicitly from the instance variable"+ct.ConstructorTest());
	}
}
