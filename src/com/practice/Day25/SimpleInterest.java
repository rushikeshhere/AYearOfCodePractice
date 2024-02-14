package com.practice.Day25;

import java.util.Scanner;

public class SimpleInterest {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the AYear of Practice...");
		System.out.println("Enter Principle Amount :: ");
		Double principleAmount = sc.nextDouble();
		System.out.println("Enter Rate of Interest :: ");
		float interestRate = sc.nextFloat();
		System.out.println("Enter the Duration (In months):: ");
		float duration = sc.nextFloat();

		Double simpleInterest = (principleAmount * interestRate * duration) / 100;

		System.out.println("Simple Interest is :: " + simpleInterest);
		System.out.println("Total Amount to pay :: " + (principleAmount + simpleInterest));
	}
}
