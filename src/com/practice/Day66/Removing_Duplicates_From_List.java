package com.practice.Day66;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Removing_Duplicates_From_List {
	public static void main(String[] args) {
		List<Integer> al = new ArrayList<Integer>();
		al.add(11);
		al.add(45);
		al.add(78);
		al.add(11);
		al.add(56);
		al.add(78);
		System.out.println("With Duplicates: " + al);

		// Convert ArrayList to LinkedHashSet
		Set<Integer> lhs = new LinkedHashSet<Integer>(al);
		// display LinkedHashSet
		System.out.println("After Removing Duplicates: " + lhs);
	}
}
