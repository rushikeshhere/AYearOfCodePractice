package com.practice.Day81;

public class PrivateContructorTest {
	private PrivateContructorTest() {
		System.out.println("hi");
	}

	public static void main(String[] args) {
		PrivateContructorTest test = new PrivateContructorTest();

	}

}
