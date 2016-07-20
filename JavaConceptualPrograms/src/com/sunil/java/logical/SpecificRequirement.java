package com.sunil.java.logical;

public class SpecificRequirement {

	public static void main(String[] args) {
		
		//Calling getUniqueNumber
		int[] arr1={2,5,3,1,7,8,9,0};
		int[] arr2={0,3,5,9,8,7,1}; 
		
		SpecificRequirement.getUniqueNumber(arr1, arr2); //should print 2
	
	}
	
	/*There are two arrays,which has some elements except one 
	 * Array
	*/
	public static void getUniqueNumber(int[] arr1,int[] arr2)
	{
		int arr1Sum=0,arr2Sum=0;
		for(int i:arr1)
		{
			arr1Sum+=i;
		}
		for(int i:arr2)
		{
			arr2Sum+=i;
		}
		
		System.out.println(arr1Sum-arr2Sum);
	}

}
