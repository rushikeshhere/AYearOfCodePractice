package com.practice.Day19;

public class SumOfArray2 {
	public static void main(String[] args) {
		int[] array = new int[5];
		array[0] = 12;
		array[1] = 24;
		array[2] = 10;
		array[3] = 15;
		array[4] = 40;
		int sum = 0;
		for (int i : array) {
			sum += i;
		}
		System.out.println("The sum of array Elements is :: " + sum);
	}
}
