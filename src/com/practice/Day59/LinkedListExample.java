package com.practice.Day59;

import java.util.LinkedList;

public class LinkedListExample {
	public static void main(String[] args) {
		LinkedList ll= new LinkedList();
		ll.add("Rushikesh");
		ll.add("Ravi");
		ll.add(30);
		ll.add(null);
		ll.set(0, "Software");
		ll.set(1, "Venky");
		System.out.println(ll);
	}
}
