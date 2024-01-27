package com.practice.Day06;

import java.util.ArrayList;
import java.util.ListIterator;

public class UsingListIteratorMethod {
	public static void main(String[] args) {
		
		
		ArrayList<String> languages=new ArrayList<String>();
		
		ListIterator<String> listIterator=languages.listIterator();
		listIterator.add("Java");
		listIterator.add("Python");
		listIterator.add("Ruby");
		System.out.println("Programming Languages are :: "+languages);
	}

}
