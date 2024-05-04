package com.operators;

public class LabelledBlock {
	public static void main(String[] args) {
		
		int l1 =20;
		l1: {
			System.out.println("Block begins");
			
			if(l1==20) {
				break l1;
			}
			System.out.println("block ends");
		}
		System.out.println("outside block");
	}

}
