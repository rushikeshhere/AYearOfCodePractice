package com.practice.Day55;

public class SplitString {
	public static void main(String[] args) {
		String str = "March-15-2024";
		String arr[] = str.split("-",3);
		for (String str1 : arr) {
			System.out.println(str1);
		}
	}
}
