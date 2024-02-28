package com.practice.Day39;

import java.util.function.IntPredicate;

public class Printing_Even_Numbers_Using_IntPredicate {
	public static void main(String[] args) {

		int[] x = { 3, 5, 6, 7, 12, 4, 8 };
		IntPredicate p = i -> i % 2 == 0;
		for (int x1 : x) {
			if (p.test(x1))
				System.out.print(x1 + " ");
		}
	}
}
