package com.employeemanagemnetsystem;

public class Demo1 {

	public static void main(String[] args) {
       String[] projects = new String[] {"Travel", "insurance"};
       String[] tools = new String[] {"selenium", "automation test"};
		
		Manager manager = new Manager(1, "Rajendra", "Healthcare", 200000, projects);
		System.out.println(manager.id +" "+manager.name+" "+manager.dept +
				" "+manager.salary+ " "+ manager.projects);
		manager.work();
		
		Developer developer = new Developer(1, "John", "Java", 300000,"javaApplication");
		developer.work();
		
		Tester tester = new Tester(23, "Renu", "healthcare",10000.8,tools);
		tester.work();

	}

}
