package com.practice.Day34;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two Numbers :: ");
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		char operator = '\0';
		System.out.println("Available Operators are :: (+ , - , * , / , % , ^ )");
		System.out.println("Enter Operator :: ");
		operator = sc.next().charAt(0);
		switch (operator) {
		case '+':
			System.out.println("Result :: " + (num1 + num2));
			break;
		case '-':
			System.out.println("Result :: " + (num1 - num2));
			break;
		case '*':
			System.out.println("Result :: " + (num1 * num2));
			break;
		case '/':
			System.out.println("Result :: " + (num1 / num2));
			break;
		case '%':
			System.out.println("Result :: " + (num1 % num2));
			break;
		case '^':
			System.out.println("Result :: " + Math.pow(num1, num2));
			break;
		default:
			System.out.println("Invalid Operator ...");

		}
		sc.close();
	}

}
