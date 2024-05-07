package com.multithreading;

public class MultiThread extends Thread {
	
	public static void main(String[] args) throws InterruptedException {
		
		for(int j =0;j<=10;j++) {
			System.out.print(" j : " + j);
			Thread.sleep(1000);
			}
		MultiThread t = new MultiThread();
		t.start();
		
	}
	
	public void run() {
		for(int i =0;i<=10;i++) {
			System.out.print(" i : " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("child Thread");
			}
		}
	}

}
