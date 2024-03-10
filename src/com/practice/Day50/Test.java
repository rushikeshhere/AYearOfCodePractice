package com.practice.Day50;

public class Test {
	public static int findLength(String str) {
		int i = 0;
		try {
			for (i = 0;; i++) {
				str.charAt(i);
			}
		} catch (Exception e) {

		}
		return i;
	}

	public static void main(String[] args) {
		String str = "Know Java";
		System.out.println("The Length of the String is :: " + findLength(str));
	}

}
