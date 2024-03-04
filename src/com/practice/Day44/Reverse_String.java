package com.practice.Day44;

public class Reverse_String {
	public static void main(String[] args) {
		String str = "Rushikesh";
		System.out.println("The Original String is :: "+str);
		String rev = " ";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println("The Reversed String is ::"+rev);
	}
}