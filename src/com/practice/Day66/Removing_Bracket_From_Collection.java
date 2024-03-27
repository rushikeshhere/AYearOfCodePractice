package com.practice.Day66;

import java.util.ArrayList;

public class Removing_Bracket_From_Collection {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Java");
		list.add("C++");
		list.add("Python");
		list.add("Ruby");
		list.add("Scala");
		System.out.println("Before Removing Brackets :: " + list);
		System.out.println("After Removing Brackets :: " + list.toString().replace("[", "").replace("]", ""));
	}
}
