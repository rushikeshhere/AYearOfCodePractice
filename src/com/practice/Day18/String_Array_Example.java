package com.practice.Day18;

public class String_Array_Example {
	public static void main(String[] args) {

		String[] names = new String[4];
		names[0] = "Rushikesh";
		names[1] = "Pavan";
		names[2] = "Rakesh";
		names[3] = "Rajesh";
		System.out.print("Student Names :: [ ");
		for (int i = 0; i < names.length; i++)
			System.out.print(names[i] + " ");
		System.out.print(" ]");
	}
}
