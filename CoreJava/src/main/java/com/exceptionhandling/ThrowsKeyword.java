package com.exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsKeyword {
	
	void readFile() throws FileNotFoundException {
		FileInputStream fs = new FileInputStream(" ");
		
	}
	
	public static void main(String[] args)throws FileNotFoundException  {
		ThrowsKeyword th = new ThrowsKeyword();
		th.readFile();
		
	}

}
