package com.practice.Day39;

import java.util.function.BinaryOperator;

public class Addition_Using_BinaryOperator {
	public static void main(String[] args) {
		BinaryOperator<Integer> c= (a, b) -> a + b;
		System.out.println(c.apply(5, 8));
		}
}
