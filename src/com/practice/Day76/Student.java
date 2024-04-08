package com.practice.Day76;

public class Student {
	int id;
	String name;

	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String[] args) {
		Student st = new Student();
		Student st1 = new Student();
		st.display();
		st1.display();

	}
}
