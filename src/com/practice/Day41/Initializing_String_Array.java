package com.practice.Day41;

public class Initializing_String_Array {
	public static void main(String[] args) {
		String[] array = { "Rushikesh", "Here" };
		for (String str : array) {
			System.out.print(str + " ");
		}
		System.out.println("\nhash code of Array is ::" + array.hashCode());
	}
}
