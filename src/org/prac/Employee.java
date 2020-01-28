package org.prac;

public class Employee {
	private void empid(int id) {
	System.out.println(id);
	}
	private void empname(String name,int id) {
		System.out.println(name);
		System.out.println(id);
	}
	public static void main(String[] args) {
		Employee e=new Employee();
		e.empid(1234);
		e.empname("mahgsg", 12);
	}
	}


