package com.practice.Day11;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListProgram {
	public static void main(String[] args) {

		ArrayList<String> array = new ArrayList<String>();
		array.add("java");
		array.add("python");
		array.add("ruby");
		array.add("cpp");
		Iterator<String> itr = array.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
} 
