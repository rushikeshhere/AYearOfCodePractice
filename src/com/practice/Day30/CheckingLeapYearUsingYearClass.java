package com.practice.Day30;

import java.time.Year;
import java.util.Scanner;

public class CheckingLeapYearUsingYearClass {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Year :: ");
		int num = sc.nextInt();
		Year year = Year.of(num);
		if (year.isLeap())
			System.out.println(num + " :: is a Leap year... ");
		else
			System.out.println(num + " :: is not a Leap year... ");
		sc.close();
	}
}
