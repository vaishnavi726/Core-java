package com.exceptionhandling;

public class StackOverFlowException {
	
	public static void method1() {
		System.out.println("calling method2 in this block");
		method2();
	}
	
	public static void method2() {
		System.out.println("calling method1 in this block ");
		method1();
	}
	
	public static void main(String[] args) {
		method1();
	}

}
