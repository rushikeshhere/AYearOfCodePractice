package com.practice.Day71;

import java.util.Scanner;

public class Calculating_Discount_by_taking_input {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Amount :: ");
		int amount = sc.nextInt();
		System.out.println("You Entered a amount :: " + amount);
		System.out.println("Enter discount :: ");
		int discount = sc.nextInt();
		System.out.println("you Entered a discount :: " + discount);
		int s = 100 - discount;
		int discountAmount = amount * discount / 100;
		System.out.println("Discount amount is :: " + discountAmount);
		double result = s * amount / 100;
		System.out.println("Customer's total bill is :: " + result);
		sc.close();
	}
}
