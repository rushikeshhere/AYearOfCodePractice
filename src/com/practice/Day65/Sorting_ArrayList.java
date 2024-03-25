package com.practice.Day65;

import java.util.ArrayList;

class Student {
	private String name;

	private int age;

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
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

}

public class Sorting_ArrayList {
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student("Rushikesh", 1));
		list.add(new Student("Rakesh", 5));
		list.add(new Student("Jayesh", 4));
		list.add(new Student("Mahesh", 8));
		list.add(new Student("Yogesh", 7));

		System.out.println("Before Sorting: ");
		System.out.println(list);

		list.sort((a1, a2) -> a1.getName().compareTo(a2.getName()));
		System.out.println("After Sorting: ");
		System.out.println(list);

	}

}
