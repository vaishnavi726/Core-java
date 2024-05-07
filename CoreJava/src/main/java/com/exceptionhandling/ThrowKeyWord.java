package com.exceptionhandling;

public class ThrowKeyWord {
	
	static void validateAge(int age) {
		
			if(age<18) {
				throw new ArithmeticException("you are not eligible to vote");
			}
			else {
				System.out.println("you are eligible to vote");
			}
			
		}
	public static void main(String[] args) {
		ThrowKeyWord t = new ThrowKeyWord();
		t.validateAge(20);
		t.validateAge(12);
	}
	}


