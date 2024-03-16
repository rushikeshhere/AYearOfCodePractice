package com.practice.Day56;

public class AddChar_in_String {
	public static void main(String[] args) {
		String str = "HER";
		char ch = 'O';
		System.out.println("Before :: " + str);
		String result = str + Character.toString(ch);
		System.out.println("After :: " + result);
	}
}
