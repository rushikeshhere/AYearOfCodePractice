package com.practice.Day84;

public class InstanceMethod {
	public void msg() { // this is the instance method
		// if i want to call instance method then i have to create object of the class
		System.out.println("Good morning...!");
	}

	public static void main(String[] args) {
		InstanceMethod instanceMethod = new InstanceMethod();
		instanceMethod.msg();
	}

}
