package com.practice.Day07;

import java.util.LinkedList;

public class ClearingAllElementOfList {
	public static void main(String[] args) {
		LinkedList<String>list=new LinkedList<>();
		list.add("Java");
		list.add("Python");
		list.add("C++");
		list.add("Ruby");
		System.out.println("Programming languages are :: "+list);
		list.clear();
		System.out.println("Programming languages are :: "+list);

	}

}
