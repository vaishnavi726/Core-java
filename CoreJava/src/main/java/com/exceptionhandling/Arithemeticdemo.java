package com.exceptionhandling;

public class Arithemeticdemo {
	
	public static void main(String[] args) {
		try {
		int i =10, j =0;
		 System.out.println("exception thrown:" +i/j);
		}catch(ArithmeticException a) {
			System.out.println("exception hadled");
			//a.printStackTrace();  these should not use when we handle the excepption max be
			//because it will show the exception again.
			//System.out.println(a.getMessage());
	
		}System.out.println("more code can be executed after catch ");

	}

}
