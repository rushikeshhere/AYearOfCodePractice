package com.practice.Day36;

public class NumberPresentInArrayOrNot {
	public static void main(String[] args) {
		float marks[] = { 3.6f, 4.6f, 2.5f, 8.7f, 5.3f };

		float num = 4.6f;
		boolean isInArray = false;
		for (float elements : marks) {
			if (num == elements) {
				isInArray = true;
				break;
			}
		}
		if (isInArray) {
			System.out.println("This value is Present in Array.!");
		} else
			System.out.println("This value is not Present in Array.!");
	}
}
