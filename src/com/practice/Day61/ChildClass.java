package com.practice.Day61;

class ParentClass {
	public ParentClass() {
		System.out.println("ParentClass.ParentClass()");
	}
}

public class ChildClass extends ParentClass {

	public ChildClass() {
		System.out.println("ChildClass.ChildClass()");
	}

	public ChildClass(int num) {
		System.out.println("ChildClass.ChildClass() :: using arg");
	}

	public void display() {
		System.out.println("Hello");
	}

	public static void main(String[] args) {

		ChildClass c1 = new ChildClass();
		c1.display();
		ChildClass c2 = new ChildClass(16);
		c2.display();
	}

}
