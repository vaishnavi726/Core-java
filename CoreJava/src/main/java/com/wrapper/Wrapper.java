package com.wrapper;

// converting primitive to object and vice versa

public class Wrapper {
	
	public static void main(String[] args) {
		
		int i =10;
		Integer j = Integer.valueOf(i); //boxing
		int k =j.intValue(); //unboxing 
		System.out.println("primitive to object :" +j);
		System.out.println("object to primitive :" +k);
		
		
	
		
		byte b =100;
		Byte b1 = Byte.valueOf(b); //boxing
		byte b2 = b1.byteValue();
		System.out.println("primitive to object " +b1);
		System.out.println("object to primitive " +b2);
		
		//byte to String 
		byte byt =10;
		String str = Byte.toString(byt);
		System.out.println("byte to String: " +str);
		Byte bt = Byte.parseByte(str);
		System.out.println("String to byte : " +bt);
		

			}
	

}
