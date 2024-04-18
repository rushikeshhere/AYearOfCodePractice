package com.practice.Day83;

public class Sum_Of_Two_Array_Element {
	public static void main(String[] args) {
		double array[] = { 10, 20, 30, 40, 50 };
		double array1[] = { 10, 20, 30, 40, 50 };
		int sum = 0;
		int sum1 = 0;
		for (double i : array) {
			sum += i;
		}
		for (double j : array1) {
			sum1 += j;
		}
		int result = sum + sum1;
		System.out.println(result);
	}
}
