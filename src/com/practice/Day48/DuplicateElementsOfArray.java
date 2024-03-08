package com.practice.Day48;

import java.util.HashSet;

public class DuplicateElementsOfArray {
	public static void main(String[] args) {
		String str[] = { "java", "c++", "python", "C", "java" };
		HashSet<String> hs = new HashSet();
		boolean flag = false;
		for (String s : str) {
			if (hs.add(s) == false) {
				System.out.println("Found duplicate Elements :: " + s);
				flag = true;
			}
		}
		if (flag == false)
			System.out.println("No Duplicates are Present in Current Array !");

	}
}
