package com.practice.Day68;

import java.util.Arrays;
import java.util.List;

public class Converting_Array_To_List1 {
	public static void main(String[] args) {
		String [] str={"Java","Python","C","C++","Scala"};
		List<String> list = Arrays.asList(str);
		System.out.println(list);
	}

}
