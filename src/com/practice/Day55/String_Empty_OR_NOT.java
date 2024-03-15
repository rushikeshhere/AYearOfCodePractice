package com.practice.Day55;

public class String_Empty_OR_NOT {
	public static String isNullEmpty(String str) {
		if (str == null)
			return "Null";
		else if (str.isEmpty())
			return "Empty";
		else if (str.isBlank())
			return "Contains Only WhitSpaces";
		else
			return "Contains Data";
	}

	public static void main(String[] args) {
		String str1 = "Java Program";
		String str2 = "";
		String str3 = " ";
		String str4 = null;
		System.out.println("String 1 :: " + isNullEmpty(str1));
		System.out.println("String 2 :: " + isNullEmpty(str2));
		System.out.println("String 3 :: " + isNullEmpty(str3));
		System.out.println("String 4 :: " + isNullEmpty(str4));
	}
}
