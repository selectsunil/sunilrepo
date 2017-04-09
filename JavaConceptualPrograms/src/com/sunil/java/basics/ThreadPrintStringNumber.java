package com.sunil.java.basics;

public class ThreadPrintStringNumber {

	public static void main(String[] args) {
		CNPrinter printer=new CNPrinter();
		
		Thread t1=new Thread(new TaskCharecterNumber(26,printer,true));
		Thread t2=new Thread(new TaskCharecterNumber(26,printer,false));
		
		t1.start();
		t2.start();

	}
	
	
	
}


class TaskCharecterNumber implements Runnable {
	private int max;
	private CNPrinter printer;
	private boolean isNumber;
	
	public TaskCharecterNumber(int max, CNPrinter printer, boolean isNumber) {
		
		this.max = max;
		this.printer = printer;
		this.isNumber = isNumber;
	}
	
	@Override
	public void run() {
		char ch='A';
		for(int i=1;i<=max;i++){
			if(isNumber){
				printer.printNumber(i);
				
			}else{
				printer.printCharecter(ch);
				ch++;
			}
		}
		
	}
	
}

class CNPrinter{
	
	private boolean isNumber=false;
	
	synchronized void printNumber(int number){
		
		if(isNumber==true){
			try {
				wait();
			} catch (InterruptedException e) {					
				e.printStackTrace();
			}
		}
		
		System.out.println(number);
		isNumber=true;
		notifyAll();
		
	}
	
	synchronized void printCharecter(char ch){
		if(isNumber==false){
			try {
				wait();
			} catch (InterruptedException e) {					
				e.printStackTrace();
			}
		}
		System.out.println(ch);
		isNumber=false;
		notifyAll();
		
	}
	
}

