package com.practice.Day67;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Checking_Vowels_Using_Set {

	private static boolean checkVowels(char ch) {

		if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
			return true;
		return false;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :: ");
		String str = sc.nextLine();
		Set<Character> vowels = new HashSet<Character>();
		Set<Character> consonents = new HashSet<Character>();
		char ch = 0;

		str = str.toUpperCase();

		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				if (checkVowels(ch)) {
					vowels.add(ch);
				} else
					consonents.add(ch);
			}
		}
		System.out.println("Vowels :: " + vowels);
		System.out.println("Consonants :: " + consonents);

	}

}
