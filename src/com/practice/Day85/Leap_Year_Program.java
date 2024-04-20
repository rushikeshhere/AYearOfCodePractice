package com.practice.Day85;

import java.util.Scanner;

public class Leap_Year_Program {
	public static void main(String[] args) {
		boolean result = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Year to check Leap or not!");
		int year = sc.nextInt();
		if ((year % 4 == 0) && (year % 400 == 0) || (year % 100 == 0))
			result = true;
		else
			result = false;
		if (result == true)
			System.out.println(year + ": This year is a leap year..");
		else
			System.out.println("This year is not Leap year..");
		sc.close();
	}
}
