package com.practice.Day06;

import java.util.LinkedList;

public class Demo1 {

	public static void main(String[] args) {

		// create Obj of linkedmammals
		LinkedList<String> mammals = new LinkedList<>();
		mammals.add("dog");
		mammals.add("Cat");
		mammals.add("cow");
		mammals.add("monkey");
		System.out.println("Mammals are :: " + mammals);

		LinkedList<String> animal = new LinkedList<>();
		animal.add("Crocodile");
		animal.addAll(mammals);
		System.out.println("Animals are :: " + animal);

	}

}
