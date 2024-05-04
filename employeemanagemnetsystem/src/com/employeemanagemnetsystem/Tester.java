package com.employeemanagemnetsystem;

public class Tester extends Employee{

	String[] tools;
	
	public Tester(int id, String name, String dept, double salary, String[] tools) {
		super(id, name, dept, salary);
		this.tools = tools;
	}
	
	protected void work() {
		super.work();
		System.out.println("tester is testing the code");
		
		for(int i=0 ;i<tools.length;i++) {
			System.out.println(tools[i]);
		}
	}

}
