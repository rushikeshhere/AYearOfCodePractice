package com.practice.Day07;

import java.util.ArrayList;
import java.util.ListIterator;

public class RemoveUsingListIterator {

	public static void main(String[] args) {

		ArrayList<String> languages = new ArrayList<String>();

		languages.add("Java");
		languages.add("Python");
		languages.add("Ruby");
		System.out.println("Programming Languages are :: " + languages);
		ListIterator<String> listIterator = languages.listIterator();
		listIterator.next();
		listIterator.remove();
		System.out.println("\nProgramming Languages are :: " + languages);
	}
}
