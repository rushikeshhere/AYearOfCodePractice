package com.practice.Day83;

public class Printing_numbers_withoutUsing_loop {
	public static void printNumbers(int num) {
		if (num > 0) {
			printNumbers(num - 1);
			System.out.print(num + " ");
		}
	}

	public static void main(String[] args) {
		int n=100;
		printNumbers(n);
	}

}
