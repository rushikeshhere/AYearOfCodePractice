package com.practice.Day61;

class Parent1 {
	void display() {
		System.out.println("Parent1.display()");
	}
}

public class MethodLevel_Super_Keyword extends Parent1 {
	void display() {
		System.out.println("MethodLevel_Super_Keyword.display()");
	}

	void printMsg() {
		display();
		super.display();
	}

	public static void main(String[] args) {
		MethodLevel_Super_Keyword m = new MethodLevel_Super_Keyword();
		m.printMsg();
	}
}
