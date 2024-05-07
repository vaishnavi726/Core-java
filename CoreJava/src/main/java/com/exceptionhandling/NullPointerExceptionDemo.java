package com.exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class NullPointerExceptionDemo {
	
	static void display() throws FileNotFoundException {
		
		FileInputStream in = new FileInputStream("");
		
	}
	
	public static void main(String[] args) {
		try {
			NullPointerExceptionDemo.display();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
