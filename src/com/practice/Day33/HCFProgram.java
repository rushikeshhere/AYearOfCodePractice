 package com.practice.Day33;

import java.util.Scanner;

public class HCFProgram {

	public static int findHCF(int num1, int num2) {

		int hcf = 0;
		int i = 1;
		while (i <= num1 && i <= num2) {
			if (num1 % i == 0 && num2 % i == 0) {
				hcf = i;
			}
			i++;
		}
		return hcf;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two numbers :: ");
		int num1 = 0;
		int num2 = 0;
		int hcf = 0;
		num1 = sc.nextInt();
		num2 = sc.nextInt();

		hcf = findHCF(num1, num2);
		System.out.printf("The HCF of Two Numbers ( %d , %d) is ::  %d", num1, num2, hcf);

	}

}
