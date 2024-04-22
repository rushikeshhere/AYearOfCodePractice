package com.practice.Day87;

import java.util.ArrayList;
import java.util.List;

public class Join_List_Of_Strings {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Pro");
		list.add("gram");
		list.add("ing");
		System.out.println("List : " + list);
		String str = "";
		for (String st : list) {
			str += st;
		}
		System.out.println("String is : " + str);
	}

}
