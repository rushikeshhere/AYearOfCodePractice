package com.practice.Day36;

public class FindingMaxElementInArray {
	public static void main(String[] args) {
		int array[] = { 1, 200, 460, 860, 750 };
		int max = 0;
		for (int element : array) {
			if (element > max)
				max = element;
		}
		System.out.println("The Maximum Element of current Array is :: " + max);
	}
}
