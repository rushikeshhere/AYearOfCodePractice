package com.practice.Day98;

public class Average_Of_Array_Elements {
	public static void main(String[] args) {

		int arr[] = { 10, 20, 50, 80, 60, 40, 50, 88 };

		double sum = 0;
		for (int i : arr) {
			sum += i;
		}
		System.out.println(sum);
		double average = sum / arr.length;
		System.out.println("The Average of Array Element is :: " + average);
	}

}
