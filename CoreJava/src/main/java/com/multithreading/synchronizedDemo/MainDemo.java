package com.multithreading.synchronizedDemo;

public class MainDemo  {
	
	public static void main(String[] args) {
		
		DisplayMessage message = new DisplayMessage();
		MyThread t = new MyThread(message, "vyshu");
		MyThread t1 = new MyThread(message, "ellendula");
		
		t.start();
		t1.start();
		
	}

}
