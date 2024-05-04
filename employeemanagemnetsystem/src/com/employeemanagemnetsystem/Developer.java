package com.employeemanagemnetsystem;

public class Developer extends Employee {
	
	String developapplication;

	public Developer(int id, String name, String dept, double salary, String developapplication) {
		super(id, name, dept, salary);
		this.developapplication=developapplication;
	}
	
	protected void work() {
		super.work();
		System.out.println("developing code for application" +developapplication);
	}
	

}
