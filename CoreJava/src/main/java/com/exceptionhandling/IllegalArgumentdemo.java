package com.exceptionhandling;

public class IllegalArgumentdemo {
	
	public static int sum(int a , int b) {
		if(a==0 || b==0) {
			throw new IllegalArgumentException("a and b shoould not be zero ");
		}
		return a+b;
	}
	
	
	public static void main(String[] args) {
		
		Thread t = new Thread();
		t.setPriority(10);
		sum(0,0);
	}

}
