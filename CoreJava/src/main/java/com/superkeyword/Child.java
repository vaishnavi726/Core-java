package com.superkeyword;

public class Child extends Parent {
	int a,b;
	Child(int a, int b){
		super();
		this.a=a;
		this.b =b;
	}
	
	void action() {
		super.action();
		System.out.println("follow instructions");
		System.out.println("value of a: " +a +" " + "value of b : " +b);
	    
	}

}
