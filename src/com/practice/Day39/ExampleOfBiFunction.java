package com.practice.Day39;

import java.util.ArrayList;
import java.util.function.BiFunction;

class Employee {
	String name;
	Integer id;

	public Employee(String name, Integer id) {
		super();
		this.name = name;
		this.id = id;
	}
}

public class ExampleOfBiFunction {
	public static void main(String[] args) {
		ArrayList<Employee> l = new ArrayList<Employee>();
		BiFunction<String, Integer, Employee> bf = (name, id) -> new Employee(name, id);

		l.add(bf.apply("Rushikesh", 101));
		l.add(bf.apply("Ramesh", 102));
		l.add(bf.apply("Rakesh", 103));
		for (Employee e : l) {
			System.out.println("Employee Id :: " + e.id);
			System.out.println("Employee name :: " + e.name);
			System.out.println();
		}
	}
}
