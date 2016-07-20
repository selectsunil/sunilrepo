package com.sunil.java.basics;


class MyThread implements Runnable
{
	private Thread th;
	
	MyThread()
	{
			System.out.println("inside MyThread2 constructor");
			//th=new Thread(this,"Sunil");
			//th.start();
			//th.start();
			
	}
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			try{
			System.out.println("inside run() of Thread ");
			
			Thread.sleep(1000);
			}
			catch(Exception e){
			}
			
		}
	}


}





public class ThreadWithRunnable 
{
	public static void main(String[] args) 
	{
		
		try
		{
		
				//MyThread t=new MyThread();
				
				Thread t1=new Thread(new MyThread(),"Thread1");
				Thread t2=new Thread(new MyThread(),"Thread2");
				
				t1.start();
				t2.	start();
				
				t1.join();
				t2.join();
				
				System.out.println(t1.getName());
				System.out.println(t2.getName());
				
				//t.run();    //start() is there cos if you directly call run() from thread reference -the next statement will not executed untill the run() finished
			
					//t.join();
				


				
				System.out.println("Main Program ends here!");
		}
		catch(Exception e)
		{
			System.out.println("Error:"+e);
		}
	}
}
