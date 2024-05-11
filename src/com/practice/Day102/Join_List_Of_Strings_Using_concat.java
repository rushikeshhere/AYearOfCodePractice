package com.practice.Day102;

import java.util.ArrayList;
import java.util.List;

public class Join_List_Of_Strings_Using_concat {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Know");
		list.add("Java");
		list.add("Programming");
		System.out.println("list : " + list);
		String string ="";
		for (String str : list) {
			string =string.concat(str);
		}
		System.out.println("String is :: "+string);
	}
}
