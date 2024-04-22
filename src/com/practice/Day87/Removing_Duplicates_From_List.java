package com.practice.Day87;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Removing_Duplicates_From_List {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Java");
		list.add("C++");
		list.add("Python");
		list.add("Java");
		list.add("C++");
		list.add("Java");
		System.out.println("With Duplicates: " + list);

		Set<String> set = new LinkedHashSet<String>(list);
		System.out.println("After Removing Duplicates :: " + set);
	}
}
