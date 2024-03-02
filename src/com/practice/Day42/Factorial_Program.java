package com.practice.Day42;

public class Factorial_Program {
	public static void main(String[] args) {
		int number = 5;
		int fact = 1;
		for (int i = number; i >1; i--) {
			fact = i * fact;
		}
		System.out.println(fact);
	}
}
