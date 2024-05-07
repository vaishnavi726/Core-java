package com.exception.assertions;

public class Assertion {

	public static void main(String[] args) {
		
		int withdrawAmount =500;
		int currentBalance =1000;
		
		assert(withdrawAmount > currentBalance): "unable to draw the expected amount";

	}

}
