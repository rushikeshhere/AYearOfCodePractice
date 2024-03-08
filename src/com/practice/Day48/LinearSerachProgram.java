package com.practice.Day48;

public class LinearSerachProgram {
	public static void main(String[] args) {
		String str[] = { "java", "c++", "python", "C", "java" };
		boolean flag = false;
		String str1 = "C";

		for (int i = 0; i < str.length; i++) {
			if (str1 == str[i]) {
				System.out.println("Element fount at :: " + i);
				flag = true;
				break;
			}
		}
		if (flag == false)
			System.out.println("No Duplicates are Present in Current Array !");
	}
}
