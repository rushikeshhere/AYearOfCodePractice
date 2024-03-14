package com.practice.Day54;

public class Added_New_Line_Using_Property {
	public static void main(String[] args) {
		String newLine = System.getProperty("line.separator");
		System.out.println("Java" + newLine + "Program");
	}
}
