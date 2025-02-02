package javabean;

import java.util.Scanner;

public class EmployeeMainClass {
	public static void main (String[] args) {
		Employee e = new Employee();
		int id;
		String name;
		double salary;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Id: ");
		id=s.nextInt();
		System.out.println("Enter Name:");
		name=s.next();
		System.out.println("Enter Salary:");
		salary=s.nextDouble();
		e.setId(id);
		e.setName(name);
		e.setSalary(salary);
		System.out.println(e.getId());
		System.out.println(e.getName());
		System.out.println(e.getSalary());
	}

}
