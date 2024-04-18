package com.practice.Day83;

public class Average_Of_Array_Elements {
	public static void main(String[] args) {
		double array[] = { 10, 20, 30, 40, 50 };
		int length = array.length;
		int sum = 0;
		for (double i : array) {
			sum += i;
		}
		double avg = sum / length;
		System.out.println(avg);
	}
}
