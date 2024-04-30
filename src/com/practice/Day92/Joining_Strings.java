package com.practice.Day92;

import java.util.ArrayList;
import java.util.List;

public class Joining_Strings {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Pro");
		list.add("gram");
		list.add("ming");
		System.out.println("List: " + list);
		String str = " ";
		for (String str1 : list) {
			str = str.concat(str1);
		}
		System.out.println("String :: " + str);
	}
}
