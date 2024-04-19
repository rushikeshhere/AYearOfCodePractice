package com.practice.Day84;

public class Demo {
	int test_a, test_b;

	Demo(int a, int b) {
		test_a = a;
		test_b = b;
	}

	public static void main(String[] args) {
		Demo d = new Demo();
		System.out.println(d.test_a + " " + d.test_b);
	}

}
