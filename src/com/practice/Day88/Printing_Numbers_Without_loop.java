package com.practice.Day88;

public class Printing_Numbers_Without_loop {
	public static void display(int n) {
		if (n > 1) {
			display(n - 1);
		}
		System.out.print(n + " ");
	}

	public static void main(String[] args) {
		int n = 100;
		display(n);
	}
}
