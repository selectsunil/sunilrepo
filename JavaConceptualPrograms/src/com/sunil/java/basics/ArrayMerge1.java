package com.sunil.java.basics;

public class ArrayMerge1
{
   //Given 2 arrays are sorted previously
	
   public int[] mergeArrays(int[] x,int[] y)
   {
	  
		if(x[0]<y[0])
		   return merge(x,y);
		else
		   return merge(y,x);
	 
   }

   public int[] merge(int[] a,int[] b)
   {
	  int[] c=new int[a.length+b.length];
	  c[0]=a[0];
	  int k=1,j=0;
	  try
	  {
		for(int i=0;i<a.length;i++)
		{
			while(j<b.length)
			{
				if(b[j]>a[i] && b[j]<a[i+1])
				{
					c[k]=b[j];
					j++;
					k++;
					System.out.println("if"+c[k]);
				}
				else
				{
					c[k]=a[i+1];
					k++;
					System.out.println("break"+c[k]);
					break;
				}
				
			}
		}
		
	  }catch(Exception e)
	  {
		  System.out.println("Exception in merge");
	  }
	  return c;
   }

  public static void main(String args[])
  {
	  
	  try
	  {
		  int[] x={3,5,6,7,9,13};
		  int[] y={2,4,8,10,11,12}; 
		 // x={3,5,6,7,9,13};
		 // y={2,4,8,10,11,12};
		  ArrayMerge am=new ArrayMerge();
		  int[] z=am.mergeArrays(x,y);
		  System.out.println("Find the Merged Array below have size"+z.length);
		  for(int i=0;i<z.length;i++)
		  {
			  System.out.println(z[i]);
		  }
	  }catch(Exception e)
	  {
		  System.out.println("Exception in main");
	  }
	  
	  
  }
}
