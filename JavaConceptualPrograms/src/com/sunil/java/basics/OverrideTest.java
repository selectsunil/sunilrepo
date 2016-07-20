
package com.sunil.java.basics;

import java.io.IOException;

class Base
{
	public  static void doStuff()
	{
		System.out.println("Base");
	}

	public  int doStuff1()
	{
		System.out.println("Base");
		return 2;
	}
	public  final void doStuff2()
	{
		System.out.println("Base");
	}
	
	protected  void doStuff3()
	{
		System.out.println("Base");
	}
	
	public  void doStuff4() throws IOException
	{
		System.out.println("Base");
	}
	
	public  void doStuff5() throws Exception
	{
		System.out.println("Base");
	}

}
class Sub extends Base
{
	/*public  void doStuff() 	
	{
		System.out.println("Sub");//instance method can't over ride a static method ---throw compile time exception
	}

	public void doStuff1()
	{
		System.out.println("Base");//can't over ride cos signature mismatch--throw compile time exception
	}
	public void doStuff2()
	{
		System.out.println("Base");//can't over ride cos overridden method is final
	}
	
	private void doStuff3()
	{
		System.out.println("Base");//can't over ride cos overridden method has less restrictive access specifier than the base method- throw compile time exception
	}
	
	public  void doStuff4() throws IOException,ClassNotFoundException
	{
		System.out.println("Base overridden"); //Sub Class method should always throw Exceptions that is mentioned in Super Class exactly or its sub types - while over riding
	}*/
	
	public  void doStuff5() throws IOException,ClassNotFoundException
	{
		System.out.println("Base overridden"); //Sub Class method should always throw sub types of Exceptions that is mentioned in Super Class - while over riding
	}
}


class OverrideTest 
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		Sub s=new Sub();
		
		try {
			s.doStuff5();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
