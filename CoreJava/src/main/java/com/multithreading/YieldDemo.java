package com.multithreading;

class YieldDem extends Thread{
	
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("child thread");
			Thread.yield();
		}
	}
	
}

public class YieldDemo{
	public static void main(String[] args) {
		YieldDem d = new YieldDem();
		d.start();
		for(int i=1;i<=5;i++) {
			System.out.println("main thread");
			
	}}
	
}
