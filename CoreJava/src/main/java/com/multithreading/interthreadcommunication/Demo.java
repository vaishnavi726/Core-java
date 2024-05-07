package com.multithreading.interthreadcommunication;

 class Dem extends Thread{
	 int total;
	
	public void run() {
		System.out.println("childthread executes");
		synchronized(this) {
			for(int i=0;i<=10;i++) {
				total += i;
			}
			this.notify();
		}
		
}}

public class Demo {
	public static void main(String[] args) throws InterruptedException {
		Dem d = new Dem();
		d.start();
	   synchronized(d) {
		   System.out.println("main thread is going to wait");
		   d.wait();
		   System.out.println("main method is notified");
		   System.out.println(d.total);
			
		}
	}
}
