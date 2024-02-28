package com.practice.Day39;

import java.util.function.BiFunction;

public class Bi_Function {
	public static void main(String[] args) {
		BiFunction<String, String, String> b = (s1, s2) -> s1 + s2;

		System.out.println(b.apply("Rushikesh ", "Here"));
	}
}
