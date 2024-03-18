package com.practice.Day58;

public class Remove_char_At_index {
	public static void main(String[] args) {
		 StringBuilder str = new StringBuilder("Know Program");
	      System.out.println("Actual String = " + str.toString());

	      str = str.deleteCharAt(3);
	      System.out.print("String after removing the character: ");
	      System.out.println(str.toString());
	}
}
