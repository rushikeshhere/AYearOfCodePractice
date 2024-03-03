package com.practice.Day43;

import java.util.Scanner;

public class Comparing_Two_Strings {

	public static boolean comparingTwoStrings(String str1, String str2) {
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		return str1.contains(str2);
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a String to compare ::");
		String str1=sc.nextLine();
		System.out.println("Enter a Second String to compare with First ::");
		String str2=sc.nextLine();
		System.out.println(comparingTwoStrings(str1, str2));
	}
}
