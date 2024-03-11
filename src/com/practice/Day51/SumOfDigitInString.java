package com.practice.Day51;

public class SumOfDigitInString {
	public static void main(String[] args) {

		String number = "12456";
		int sum = 0;
		for (int i = 0; i < number.length(); i++) {
			char ch = number.charAt(i);
			if (Character.isDigit(ch)) {
				int value = Character.getNumericValue(ch);
				sum += value;
			}
		}
		System.out.println("The Sum of digits in String :: " + sum);
	}
}
