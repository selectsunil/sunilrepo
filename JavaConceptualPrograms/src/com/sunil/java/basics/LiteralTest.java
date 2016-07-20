package com.sunil.java.basics;
class LiteralTest
{
	
	public static void main(String[] args) 
	{
		
		//int i=2147483648;               **/This line responsible for compilation error
		//int i=-2147483649;              **/This line responsible for compilation error
		int i=2147483647;
		int i1=-2147483648;
		//long l=2373256372;              **/This line responsible for compilation error
		long l=2373256372L; 
		//long l1=11258999068426284348L;  **/This line responsible for compilation error
		long l1=1125899906842628434L;
		float fv1=362523.475744f;
        //float fv2=1.1;            **/This line responsible for compilation error
		double dv1=362523.475744d;
		double dv2=362523.475744;
		double dv3=23463.4e-4;
		double dv4=3.34e+6;
		double dv5=3.34e6;

		System.out.println("int value i="+i);
		System.out.println("int value i1="+i1);
		System.out.println("long value l="+l);
		System.out.println("long value l1="+l1);
		System.out.println("float value fv1="+fv1);
		//System.out.println("float value fv2="+fv2);
		System.out.println("double value dv1="+dv1);
		System.out.println("double value dv2="+dv2);
        System.out.println("double value dv3="+dv3);
		System.out.println("double value dv4="+dv4);
		System.out.println("double value dv5="+dv5);

		System.out.println("Escape Sequences");
		System.out.println("==================");
		System.out.println("BacksS\bpacE\be ="+'\b');//last '\b'not working
        System.out.println("Tab X"+'\t'+"Y");
		System.out.println("line feed X"+'\n'+"Y");
		System.out.println("form feed X"+'\f'+"Y");
		System.out.println("carrage return"+'\r'+"CA");
		System.out.println("Apostrophy\' quote "+'\'');
		System.out.println("Quotation\"\" mark"+'\"');
		System.out.println("Back slash\\\\ mark"+'\\');

        System.out.println();
		System.out.println("127 charecter set available");
		System.out.println("============================");
		/*for (i=0;i<128 ;i++ )
		{
			char ch=(char)i;
			System.out.println("Charecter values for "+i+" = "+ch);

		}*/
		
	}
}
