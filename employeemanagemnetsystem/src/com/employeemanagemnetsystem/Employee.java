package com.employeemanagemnetsystem;

public class Employee {
	
	public int id;
	public String name;
	public String dept;
	public double salary;
	
	public Employee(int id, String name, String dept, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
	
	protected void work() {
		System.out.println("common work for everyone");
	}
}
