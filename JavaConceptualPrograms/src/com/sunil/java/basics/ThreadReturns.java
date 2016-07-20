package com.sunil.java.basics;


class ThreadLoop implements Runnable
{
	int myValue=0;
	int increamentBy=0;
	
	ThreadLoop(int myValue,int increamentBy)
	{
			System.out.println("inside MyThread2 constructor");
			this.myValue=myValue;
			this.increamentBy=increamentBy;
			
	}
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			try{
			System.out.println("inside run() of Thread ");
			myValue=myValue+increamentBy;
			
			Thread.sleep(1000);
			}
			catch(Exception e){
			}
			
		}
	}


}





public class ThreadReturns
{
	public static void main(String[] args) 
	{
		
		try
		{
		
				//MyThread t=new MyThread();
			ThreadLoop tl1=new ThreadLoop(10,2);
				
				Thread t1=new Thread(tl1,"Thread1");
				//Thread t2=new Thread(new MyThread(),"Thread2");
				
				t1.start();
				//t2.	start();
				
				t1.join();
				//t2.join();
			
				
				System.out.println(t1.getName());
				System.out.println(tl1.myValue);
				//System.out.println(t2.getName());
				
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
