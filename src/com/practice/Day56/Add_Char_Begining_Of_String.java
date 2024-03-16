package com.practice.Day56;

public class Add_Char_Begining_Of_String {
	public static void main(String[] args) {
		String str = "RANGE";
		System.out.println("Before :: " + str);
		char ch = 'O';
		String result = Character.toString(ch) + str;
		System.out.println("After :: " + result);
	}
}
