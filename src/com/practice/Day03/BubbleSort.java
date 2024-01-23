package com.practice.Day03;

public class BubbleSort {

	static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	static void bubbleSort(int[] array) {
		int n = array.length;

		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {

		int array[] = { 98, 45, 78, 32, 65, 15, 32, 45 };
		System.out.println("original Array ::");
		printArray(array);
		bubbleSort(array);

		System.out.println("\nSorted Array ::");

		printArray(array);
	}
}
