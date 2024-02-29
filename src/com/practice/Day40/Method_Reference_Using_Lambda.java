package com.practice.Day40;

public class Method_Reference_Using_Lambda {
	public static void m1() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread..");
		}
	}

	public static void main(String[] args) {
		Runnable r = Method_Reference_Using_Lambda::m1;
		Thread t = new Thread(r);
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread..");
		}

	}

}
