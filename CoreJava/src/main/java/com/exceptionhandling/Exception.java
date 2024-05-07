package com.exceptionhandling;

public class Exception {

	public static void main(String[] args) {
		try {
		String input =args[0];
		System.out.println("input is : " +input);
		int output = Integer.parseInt(input);
		System.out.println("output is :" +output);
		}catch(ArrayIndexOutOfBoundsException a) {
			System.out.println("input is required");
		}catch(NumberFormatException n) {
			System.out.println("Invalid input provided ");
		}System.out.println("more code to execute");
	}
}
