package com.practice.Day33;

import java.util.Scanner;

public class HCFProgram1 {
	public static int findHCF(int num1, int num2) {
		while (num1 != num2) {
			if (num1 > num2)
				num1 = num1 - num2;
			else
				num2 = num2 - num1;
		}
		return num1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers .:: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int hcf = findHCF(num1, num2);
		System.out.printf("The Highest common factor of (%d , %d) is :: %d ", num1, num2, hcf);
		sc.close();
	}
}
