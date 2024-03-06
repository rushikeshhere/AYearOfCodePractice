package com.practice.Day46;

import java.util.Arrays;

public class CheckingTwoArraysEqual {
	public static void main(String[] args) {
		int a[] = { 4, 5, 6, 1, 2, 3 };
		int b[] = { 4, 5, 6, 1, 2, 3 };

		Boolean status = Arrays.equals(a, b);
		if (status == true)
			System.out.println("Both a and b arrays are Equal ..");
		else
			System.out.println("Both a and b Arrays are Not Equal..");
	}
}
