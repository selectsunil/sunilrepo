


package com.sunil.java.basics;

public class ThreeThreads {

	public static void main(String[] args) {
		CSNPrinter printer=new CSNPrinter();
		
		Thread t1=new Thread(new TaskSmallCapitalNumber(26,printer,"capital"));
		Thread t2=new Thread(new TaskSmallCapitalNumber(26,printer,"small"));
		Thread t3=new Thread(new TaskSmallCapitalNumber(26,printer,"number"));
		
		t1.start();
		t2.start();
		t3.start();

	}
	
	
	
}


class TaskSmallCapitalNumber implements Runnable {
	private int max;
	private CSNPrinter printer;
	private String type;
	
	public TaskSmallCapitalNumber(int max, CSNPrinter printer, String type) {
		
		this.max = max;
		this.printer = printer;
		this.type = type;
	}
	
	@Override
	public void run() {
		char chCap='A';
		char chSmall='a';
		for(int i=1;i<=max;i++){
			if("capital".equals(type)){
				
				printer.printCapital(chCap);
				chCap++;
			}
			else if("small".equals(type)){
				printer.printSmall(chSmall);
				chSmall++;
				
			}
			else{
				printer.printNumber(i);
				
			}
		}
		
	}
	
}

class CSNPrinter{
	
	private String type="N";
	
	synchronized void printNumber(int number){
		
		while(!"N".equals(type)){
			try {
				wait();
			} catch (InterruptedException e) {					
				e.printStackTrace();
			}
		}
		
		System.out.println(number);
		type="C";
		notifyAll();
		
	}
	
	synchronized void printCapital(char ch){
		while(!"C".equals(type)){
			try {
				wait();
			} catch (InterruptedException e) {					
				e.printStackTrace();
			}
		}
		System.out.println(ch);
		type="S";
		notifyAll();
		
	}
	
	
	synchronized void printSmall(char ch){
		while(!"S".equals(type)){
			try {
				wait();
			} catch (InterruptedException e) {					
				e.printStackTrace();
			}
		}
		System.out.println(ch);
		type="N";
		notifyAll();
		
	}
	
}


