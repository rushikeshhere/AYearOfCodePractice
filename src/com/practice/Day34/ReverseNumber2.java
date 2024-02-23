package com.practice.Day34;

public class ReverseNumber2 {
	public static void main(String[] args) {

		int a = 105;
		int reversenumber = 0;
		int remainder = 0;
		while (a > 0) {
			remainder = a % 10;
			a = a /   10;
			reversenumber = (reversenumber * 10) + remainder;
		}
		System.out.println(reversenumber);
	}

}
