package com.practice.Day59;

import java.util.ArrayList;

public class Removing_Element_From_ArrayList {
	public static void main(String[] args) {
		ArrayList l= new ArrayList();
		l.add("Java");
		l.add("Python");
		l.add("c++");
		l.add(45);
		l.add(1);
		l.add(null);
		l.remove(3);
		l.remove(2);
		System.out.println(l);
	}
}
