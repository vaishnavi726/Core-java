package com.multithreading.synchronizedDemo;

public class DisplayMessage extends Thread{
	public synchronized void sayHello(String name) {
		for(int i=1;i<=5;i++) {
			System.out.println("synchronized block: " +name);
		}
	}

}
