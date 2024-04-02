package com.practice.Day72;

public class Swapping_Two_Number_using_BitWise {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;

		a = a ^ b;
		b = a ^ b;
		a = a ^ b;

		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
}
