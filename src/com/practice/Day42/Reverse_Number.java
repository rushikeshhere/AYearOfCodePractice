package com.practice.Day42;

public class Reverse_Number {
	public static void main(String[] args) {
		int num = 567;
		int rev = 0;
		int remainder;
		System.out.println("The Original number is :: "+ num);
		while (num > 0) {
			remainder = num % 10;
			num = num / 10;
			rev = (rev * 10) + remainder;
		}
		System.out.println("The Reverse Number is :: "+rev);
	}

}
