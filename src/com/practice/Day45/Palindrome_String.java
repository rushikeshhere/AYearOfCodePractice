package com.practice.Day45;

import java.util.Scanner;

public class Palindrome_String {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String to Check Palindrome or not!");
		String str = sc.next();
		String rev = "";
		char ch[] = str.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--) {
			rev = rev + ch[i];
		}
		if (str.equals(rev))
			System.out.println(str + " ::Is the Palindrome String");
		else
			System.out.println(str + " ::Is not the Palindrome String");
	}
}
