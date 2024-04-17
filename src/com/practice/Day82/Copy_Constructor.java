package com.practice.Day82;

public class Copy_Constructor {

	int id;
	String name;

	public Copy_Constructor() {

	}

	Copy_Constructor(int i, String n) {
		id = i;
		name = n;
	}

	public Copy_Constructor(Copy_Constructor c) {
		id = c.id;
		name = c.name;
	}

	public void display() {
		System.out.println("id : " + id + " name : " + name);
	}

	public static void main(String[] args) {
		Copy_Constructor cp = new Copy_Constructor(1, "Rusikesh");
		Copy_Constructor cp1 = new Copy_Constructor(cp);
		cp.display();
		cp1.display();
	}
}
