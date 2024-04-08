package com.practice.Day76;

public class Student1 {
	int id;
	String name;

	public Student1(int i, String n) {
		id = i;
		name = n;
	}

	Student1(Student1 s) {
		id = s.id;
		name = s.name;
	}

	public void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String[] args) {
		Student1 st1= new Student1(111,"Karan");
		Student1 st2= new Student1(st1);
		st1.display();
		st2.display();
		
	}
}
