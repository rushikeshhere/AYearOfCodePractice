package com.practice.Day66;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Jonny");
		list.add("Annie");
		System.out.println("ArrayList1: " + list);

		List<String> list1 = new ArrayList<String>();
		list1.add("Jhonson");
		list1.add("Joseph");
		System.out.println("ArrayList2: " + list1);

		// append ArrayList to ArrayList
		list.addAll(list1);
		System.out.println("ArrayList1 after appending: " + list);
	}
}
