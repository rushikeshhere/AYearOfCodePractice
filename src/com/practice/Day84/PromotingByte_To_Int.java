package com.practice.Day84;

class Test {
	public void test(int a, int b) {
		System.out.println("a = " + a + " b = " + b);
	}

	public void test(int a, float b) {
		System.out.println("a = " + a + " b = " + b);
	}
}

public class PromotingByte_To_Int {

	public static void main(String[] args) {
		byte a = 10;
		byte b = 15;
		Test t = new Test();
		t.test(a, b);// promoting byte to Integer
	}
}
