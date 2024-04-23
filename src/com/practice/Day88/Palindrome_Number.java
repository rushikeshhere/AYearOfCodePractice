package com.practice.Day88;

import java.util.Scanner;

public class Palindrome_Number {
	public static int reversNumber(int n) {
		int reverse = 0;
		while (n > 0) {
			reverse = (reverse * 10) + (n % 10);
			n = n / 10;
		}
		return reverse;
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Number :: ");
		int number=sc.nextInt();
		reversNumber(number);
		if(reversNumber(number)==number)
			System.out.println("is Palindrome number!");
		else
			System.out.println("is not Palindrom number");	
		sc.close();
	}
}
