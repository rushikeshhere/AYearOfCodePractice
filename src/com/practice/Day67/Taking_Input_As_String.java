package com.practice.Day67;

import java.util.Scanner;

public class Taking_Input_As_String {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :: ");
		String str = sc.nextLine();
		System.out.println("You Entered a String :: " + str);
		sc.close();
	}
}
