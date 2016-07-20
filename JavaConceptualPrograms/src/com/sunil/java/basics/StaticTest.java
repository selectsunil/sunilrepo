package com.sunil.java.basics;

public class StaticTest 
{
	static int x=50;
	int y=30;
	static void showValue()
	{		
		System.out.println("inside show value");
		//show();  //we can't call instance methods from static context
		//System.out.println("instace member variable y="+y);//we can't access instance variables  from static context
	}
	void show()
	{
		showValue();//viceversa is possible
		System.out.println("instace member variable y="+y);//viceversa is possible
	}

	public static void main(String[] args) 
	{
		
		try
		{
		
			StaticTest st=new StaticTest();
			System.out.println("static x value"+st.x);//we can access static members from object instance
			st.showValue();//we can access static methods from object instance
			st.show();
			
			st=null;
			System.out.println("static x value after asigned null to the object:"+st.x);// We can access static members  reference variable(does not matter if it is instantiated or not.
			st.showValue();//same as ebove


			System.out.println("static x value"+StaticTest.x);
			StaticTest.showValue();

			
			System.out.println("Hello World!");
		}
		catch (Exception e)
		{
			System.out.println("Error:"+e);
		}
	}
}
