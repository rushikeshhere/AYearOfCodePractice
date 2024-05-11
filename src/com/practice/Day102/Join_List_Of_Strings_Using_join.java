package com.practice.Day102;

import java.util.ArrayList;
import java.util.List;

public class Join_List_Of_Strings_Using_join {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Know");
		list.add("Java");
		list.add("Programming");
		System.out.println("list : " + list);
		String string = String.join(" ", list);

		System.out.println("String :: " + string);
	}
}
