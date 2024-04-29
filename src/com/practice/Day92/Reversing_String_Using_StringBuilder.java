package com.practice.Day92;

public class Reversing_String_Using_StringBuilder {
	public static void main(String[] args) {
		String str = "Java program";
		System.out.println("Original String is :: " + str);
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		System.out.println("After Reverse :: " + sb);
	}

}
