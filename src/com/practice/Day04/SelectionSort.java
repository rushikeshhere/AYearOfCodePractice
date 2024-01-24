package com.practice.Day04;

public class SelectionSort {

	public static void main(String[] args) {
		int array[] = { 72, 55, 47, 98, 44 };

		System.out.println("Original Array -");
		printArray(array);

		sort(array);
		System.out.println("\nSelection Sort -");
		printArray(array);
	}
	
	static void sort(int arr[]) {

		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			// find min element in unsorted Array
			int min_idx = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[min_idx]) {
					min_idx = j;
				}
				// swap the min element with the first element
				int temp = arr[min_idx];
				arr[min_idx] = arr[i];
				arr[i] = temp;
			}
		}
	}
	static void printArray(int array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
