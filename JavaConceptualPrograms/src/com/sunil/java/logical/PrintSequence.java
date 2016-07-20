package com.sunil.java.logical;

public class PrintSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*for(int i=1;i<=20;i++)
		{
			System.out.println(i);
		}*/
		
		int cnt = 0;

		for (int i = 1; i <= 100; i++) {
			if (cnt == 2 || cnt == 3) {
				cnt++;
			} else {
				System.out.println(i);
				if (cnt == 4) {
					cnt = 0;
				}
				cnt++;
			}

		}
		
	}

}
