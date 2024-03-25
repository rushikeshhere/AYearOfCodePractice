package com.practice.Day65;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee> {
	private String name;
	private int age;

	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.age -o.getAge();
	}

}

public class Sorting_ArrayList_using_Collection_Sort {
	public static <T> void main(String[] args) {
		List<Employee> list1 = new ArrayList<Employee>();
		list1.add(new Employee("John", 32));
		list1.add(new Employee("Alex", 23));
		list1.add(new Employee("Nik", 27));
		list1.add(new Employee("Samual", 20));

		System.out.println(list1);

		Collections.sort(list1);
		System.out.println(list1);
	}
}
