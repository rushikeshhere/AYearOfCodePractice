package com.practice.Day41;

import java.util.Scanner;

public class Printing_Multiplication_Table {
	public static void table(int number) {
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d * %d = %d \n", number, i, (number * i));
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number To Print a Multiplication Table :: ");
		int num=sc.nextInt();
		table(num);
		sc.close();
	}

}
