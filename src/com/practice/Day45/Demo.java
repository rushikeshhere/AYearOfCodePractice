package com.practice.Day45;

public class Demo {
	public static void main(String[] args) {
		int number = 1234567;
		System.out.println("Original number is :: " + number);
		int count = 0;
		while (number > 0) {
			number = number / 10;
			count++;
		}
		System.out.println("The number of digits are :: " + count);
	}
}
