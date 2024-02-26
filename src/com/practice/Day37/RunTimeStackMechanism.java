package com.practice.Day37;

public class RunTimeStackMechanism {
	public static void doStuff() {
		doMoreStuff();
	}

	public static void doMoreStuff() {
		System.out.println("Hello..");
	}

	public static void main(String[] args) {
		doStuff();
	}
}
