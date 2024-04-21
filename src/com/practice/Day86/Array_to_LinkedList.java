package com.practice.Day86;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Array_to_LinkedList {
	public static void main(String[] args) {
		String[] emotions = { "Happy", "Sad", "Angry", "Depressed" };
		List<String> list = Arrays.asList(emotions);
		LinkedList<String> linkedlist = new LinkedList<String>(list);
		System.out.println("Array : " + Arrays.toString(emotions));
		System.out.println("Type : " + emotions.getClass().getName());
		System.out.println("LinkedList : " + linkedlist);
		System.out.println("Type : " + linkedlist.getClass().getName());
	}

}
