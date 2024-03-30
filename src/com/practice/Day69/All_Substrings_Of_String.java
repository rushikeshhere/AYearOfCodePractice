package com.practice.Day69;

import java.util.Scanner;

public class All_Substrings_Of_String {
	public static void main(String[] args) {

		String str, sub;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a new String :: ");
		str = sc.nextLine();
		int length = str.length();
		for (int i = 0; i < length; i++) {
			for (int j = 1; j <= length - i; j++) {
				sub = str.substring(i, i + j);
				System.out.println(sub);
			}
		}
		sc.close();
	}
}
