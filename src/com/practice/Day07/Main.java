package com.practice.Day07;

import java.util.LinkedList;

public class Main {
	public static void main(String[] args) {
		LinkedList<String>list=new LinkedList<>();
		list.add("Java");
		list.add("Python");
		list.add("C++");
		list.add("Ruby");
		System.out.println("Programming languages are :: "+list);
		
		// remove element from index 1
		String str=list.remove(1);
		System.out.println("Removed Element is :: "+str);
		
		System.out.println("updated Programmin Languages list is :: "+list);
	}
}
