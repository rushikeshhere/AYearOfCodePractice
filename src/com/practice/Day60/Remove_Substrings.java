package com.practice.Day60;

public class Remove_Substrings {
	public static void main(String[] args) {
		String str = "Know Program - Java Programming";
		String substring = "Program";
		String resultantString = str.replace(substring, "");
		System.out.println("String after Removing \"" + substring + "\" SubString:\n" + resultantString);
	}
}
