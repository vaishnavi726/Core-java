package com.multithreading.synchronizedDemo;

public class MyThread extends Thread{
	
	DisplayMessage displaymessage;
	String name;
	
	public MyThread(DisplayMessage displaymessage, String name) {
		
		this.displaymessage = displaymessage;
		this.name = name;
	}
	
	public void run() {
		displaymessage.sayHello(name);
	}
	
	

}
