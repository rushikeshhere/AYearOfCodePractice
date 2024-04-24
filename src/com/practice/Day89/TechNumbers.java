package com.practice.Day89;

import java.util.Scanner;

public class TechNumbers {

	public static boolean isTech(int number) {

		int n = number;
		int count = 0;
		int firstHalf = 0;
		int lastHalf = 0;
		int sum = 0;

		while (n != 0) {
			n=n/ 10;
			count++;
		}
		if (count % 2 != 0)
			return false;
		
		firstHalf =  number / (int)Math.pow(10, count / 2);
		lastHalf = number % (int)Math.pow(10, count / 2);

		sum = firstHalf + lastHalf;

		if (sum * sum == number)
			return true;
		return false;
	}

	public static void main(String[] args) {
		int number = 0;

		// read the input
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter an integer number:: ");
		number = scan.nextInt();

		if (isTech(number))
			System.out.println(number + " is a" + " tech number");
		else
			System.out.println(number + " is not a" + " tech number");

		scan.close();
	}
}
