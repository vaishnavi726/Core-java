package com.exceptionhandling;

public class Arithemeticdemo {
	
	public static void main(String[] args) {
		try {
		int i =10, j =0;
		 System.out.println("exception thrown:" +i/j);
		}catch(ArithmeticException a) {
			System.out.println("exception hadled");
			a.printStackTrace();
		}

	}

}
