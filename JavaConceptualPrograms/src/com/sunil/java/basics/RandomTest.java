package com.sunil.java.basics;

import java.util.ArrayList;





public class RandomTest {

	public static void main(String[] args) {
		

				
				try{
					
					//String obj1=new String();
					//String obj2=new String();
					
					//ArrayList obj1=new ArrayList();
					//ArrayList obj2=new ArrayList();
					
					TryCatch obj1=new TryCatch();
					TryCatch obj2=new TryCatch();
					
					if (obj1==obj2)
					{
						System.out.println("true");
					}else
					{
						System.out.println("false");
					}
					
					if (obj1.equals(obj2))
					{
						System.out.println("true");
					}else
					{
						System.out.println("false");
					}
				}
				finally{
					
				}
		
	}

}
