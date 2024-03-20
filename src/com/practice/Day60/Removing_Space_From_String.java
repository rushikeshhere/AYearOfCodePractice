package com.practice.Day60;

public class Removing_Space_From_String {
	public static void main(String[] args) {
		String str = "   Java Programming   ";
		str = str.replaceAll("\\s", "");
		System.out.println(str);
	}
}
