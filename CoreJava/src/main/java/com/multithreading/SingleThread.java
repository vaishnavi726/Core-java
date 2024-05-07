package com.multithreading;

public class SingleThread implements Runnable{

	@Override
	public void run() {
		
		for(int i=0;i<=100;i++) {
			System.out.print("i:" +i +" "+ " \t ");
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		SingleThread t = new SingleThread();
		Thread t1 = new Thread(t);
		t1.start();
		//t1.join();
		t.run();
		
		
		
	}

}
