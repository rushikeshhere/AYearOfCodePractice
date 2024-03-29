package com.practice.Day68;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Converting_Array_To_List {
	public static <T> List<T> convertArrayToString(T array[]) {
		List<T> list = new ArrayList<>();
		for (T t : array) {
			list.add(t);
		}
		return list;
	}
	public static void main(String[] args) {
		String str[]= {"Java","Python","C","C++","Scala"};
		System.out.println(Arrays.toString(str));
		System.out.println(str.getClass());
		List<String> convertArrayToString = convertArrayToString(str);
		System.out.println(convertArrayToString);
		System.out.println(convertArrayToString.getClass());

	}
}
