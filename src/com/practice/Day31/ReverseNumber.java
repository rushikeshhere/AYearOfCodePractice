package com.practice.Day31;

public class ReverseNumber {
	public static void main(String[] args) {
		int a = 456;
		System.out.print("The Reverse of "+a+" is :: ");
		int lastDigit;
		int reverse = 0;
		while (a != 0) {
			lastDigit = a % 10;
			reverse = reverse * 10;
			reverse = reverse + lastDigit;
			a = a / 10;
		}
		System.out.println(reverse);
	}

}
