package com.sunil.java.basics;

public class Exception1
{
	
	public String getValue() 
	{
			try	{
				System.out.println("try process");
				int a=1/0;
				return "try";
				}
				//System.out.println("stuff");//in between try and catch we can write any code...it causes compilation error -try without catch or finally
			catch(Exception e)
				{
				System.out.println("catch block start here!");
					return "catch";
				//System.out.println("After return stmt within catch!");//this statement give compilation error "unreachable code"
				}
				//System.out.println("stuff");//in between catch and finally we can write any code...it causes compilation error -finally without try
			finally
				{
				System.out.println("finally block start here!");
				return "finally";
				//System.out.println("After return stmt within finally!");  //this statement give compilation error "unreachable code"
				}
			
	            // System.out.println("after finally block !");//this statement give compilation error "unreachable code"
	}
	public void test1()
	{
			try	{
				System.out.println("try process");
				 //int a=1/0; this will give run time error "cos we have to handle it at any cost"
				}
                finally
				{
				System.out.println("finally block start here!");
				
				}
	}
	public int devide(int a,int b) throws MyException
	{
			try	{
				System.out.println("try process");
				if (b==0)
					throw new MyException("can't be divided by zero");
				return a/b;
				
				 
				}
				finally
				{
				System.out.println("finally block start here!");
				
				}
	}
	public static void main(String[] args) 
	{
		Exception1 e1=new Exception1();
		System.out.println("Result returned: "+e1.getValue());
		
		//e1.test1();
		try{
			//System.out.println("Result"+e1.devide(4,0));
		}
		catch(Exception e){
			e.printStackTrace();

		}

	}
}
