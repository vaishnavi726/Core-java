package com.multithreading;

import java.util.Scanner;

//program to display the sum of n numbers reading from user

public class JoinDemo extends Thread{
	static int n, sum =0;
	
	public static void main(String[] args) {
		System.out.println("sum of first n numbers");
		System.out.println("enter a value");
		Scanner scan = new Scanner(System.in);
		JoinDemo.n = scan.nextInt();
		JoinDemo demo = new JoinDemo();
		demo.start();
		try {
			demo.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("sum of : " +JoinDemo.n +" first n numbers: " +JoinDemo.sum);
		
	}
	
	public void run() {
		for(int i =0;i<=JoinDemo.n;i++) {
			JoinDemo.sum+= i;
		
		}
		
	}

}
