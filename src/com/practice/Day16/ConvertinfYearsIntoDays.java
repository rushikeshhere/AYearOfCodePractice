package com.practice.Day16;

import java.util.Scanner;

public class ConvertinfYearsIntoDays {
	
	private static final String String = null;

	public static String calAge(int age) {
		if(age<120)
		return (String).valueOf(365*age);
		else
			return "Age is Exceeded";
			
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age in years..!");
		int age=sc.nextInt();
		System.out.printf("Total Days in %d year are ::",age);
		System.out.print(calAge(age));	
		sc.close();
	}
}
