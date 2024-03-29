package com.practice.Day68;

import java.util.ArrayList;
import java.util.List;

public class Converting_Objects_into_String {
	public static void main(String[] args) {
		List<Object> objects = new ArrayList();
		objects.add("Java");
		objects.add("Python");
		objects.add("C");
		objects.add("C++");
		objects.add("Scala");

		List<String> string = new ArrayList();
		for (Object obj : objects) {
			string.add(String.valueOf(obj));
		}
		System.out.println(string);
	}
}
