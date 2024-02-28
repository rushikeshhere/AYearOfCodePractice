package com.practice.Day39;

import java.util.function.BinaryOperator;

public class Binary_Operator {
	public static void main(String[] args) {
		BinaryOperator<String> b = (s1, s2) -> s1 + s2;
		System.out.println(b.apply("Rakesh ", "Sharma"));
	}

}
