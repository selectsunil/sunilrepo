package com.sunil.java.logical;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeNumber pn=new PrimeNumber();
		
		pn.printPrimeNumbers(10);
	}
	
	public void printPrimeNumbers(int n)
	{
		for(int i=2;i<=n;i++)
		{
			if(checkPrimeNumber(i))
				System.out.println(i);
		}
	}
	
	public boolean checkPrimeNumber(int p)
	{
		int counter=0;
		
		for(int i=1;i<=p;i++)
		{
			if(p%i==0)
				counter++;
		}
		
		if(counter==2)
		 	return true;
		else
			return false;
	}

}
