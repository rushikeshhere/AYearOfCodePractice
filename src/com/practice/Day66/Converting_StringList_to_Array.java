package com.practice.Day66;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Converting_StringList_to_Array {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Java");
		list.add("Programming");
		list.add("Language");
		System.out.println("List = " + list);
		System.out.println("list type: " + list.getClass().getName());
		String[] array = list.toArray(new String[] {});
		System.out.println("Array = " + Arrays.toString(array));
		System.out.println("array type: " + array.getClass().getName());
	}
}
