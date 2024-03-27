package com.practice.Day66;

import java.util.ArrayList;
import java.util.List;

public class Appending_to_Collection {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList();
		list.add(11);
		list.add(78);
		list.add(45);
		list.add(56);
		list.add(89);
		System.out.println("Before Appending Integer :: " + list);
		list.add(32);
		System.out.println("After Append integer :: " + list);
	}
}
