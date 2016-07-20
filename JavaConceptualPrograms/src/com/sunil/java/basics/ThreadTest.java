package com.sunil.java.basics;

class MyThread1 extends Thread
{
	MyThread1()
	{
		System.out.println("inside MyThread1 constructor");
		try
		{

			start();
				System.out.println("After start()1 ");
				
			//start();//It is never legal to start a thread more than once. In particular, a thread may not be restarted once it has completed execution.
					  //throws IllegalThreadStateException at runtime and next statement will not executed
				//System.out.println("After start() ");
		}
		catch(Exception e)
		{
			System.out.println("exception"+e);

		}

		    
	}
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			try{
			System.out.println("inside run() of MyThread1 ");
			sleep(500);
			}
			catch(Exception e){
			}
			
		}
	} 
}


class MyThread2 implements Runnable
{
	private Thread th;
	
	MyThread2()
	{
			System.out.println("inside MyThread2 constructor");
			th=new Thread(this,"Sunil");
			th.start();
			
	}
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			try{
			System.out.println("inside run() of MyThread2 ");
			Thread.sleep(1000);
			}
			catch(Exception e){
			}
			
		}
	}


}





public class ThreadTest 
{
	public static void main(String[] args) 
	{
		
		try
		{
		
				MyThread1 t=new MyThread1();
				
				//t.run();    //start() is there cos if you directly call run() from thread reference -the next statement will not executed untill the run() finished
				
				MyThread2 t2=new MyThread2();
					//t.join();
				


				
				System.out.println("Hello World!");
		}
		catch(Exception e)
		{
			System.out.println("Error:"+e);
		}
	}
}
