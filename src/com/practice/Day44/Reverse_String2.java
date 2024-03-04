package com.practice.Day44;

public class Reverse_String2 {
	public static void main(String[] args) {
		String str = "Rushikesh";
		System.out.println("The Original String is :: " + str);
		String rev = " ";
		char ch;
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			rev = ch + rev;
		}
		System.out.println("The Reversed String is :: "+rev);
	}
}