package com.practice.Day30;

import java.util.Scanner;

public class CheckingLeapYear {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Year :: ");
		Integer year = sc.nextInt();
		boolean result;

		if ((year % 4 == 0) && (year % 400 == 0) || (year % 100 != 0))
			result = true;
		else
			result = false;

		if (result == true) 
			System.out.println(year + " is a Leap Year...");
		else
			System.out.println(year + " is not a Leap Year... ");
		sc.close();
	}
}
