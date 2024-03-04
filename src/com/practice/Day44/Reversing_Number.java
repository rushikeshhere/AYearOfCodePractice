package com.practice.Day44;

public class Reversing_Number {
	public static Integer reverse(int num) {
		System.out.println("The original number is :: " + num);
		int rev = 0;
		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		return rev;
	}
	public static void main(String[] args) {

		System.out.println("The Reverse Number is :: " + reverse(14567));
	}
}
