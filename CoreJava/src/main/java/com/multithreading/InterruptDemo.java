package com.multithreading;

public class InterruptDemo extends Thread {
	
	public void run() {
		try {
		for(int i=0;i<=5;i++) {
			System.out.println("child thread: "+i);
				Thread.sleep(2000);
		}
			}catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("exception handled");
			}
		}
	
	
	public static void main(String[] args) throws InterruptedException {
		InterruptDemo d = new InterruptDemo();
		d.start();
		d.interrupt();
		for(int i =0;i<=5;i++) {
			System.out.println("main thread:" +i);
		}
			}
	
	

}
