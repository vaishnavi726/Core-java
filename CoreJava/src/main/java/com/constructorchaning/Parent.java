package com.constructorchaning;

public class Parent {
	
	int x;
	
	public Parent() {
		System.out.println("no arg parent constructor" +this);
	}
	
	public Parent(int x ) {
		this();
		this.x = x;
		System.out.println("argument parent constructor" +x);
	}

}
