package com.practice.Day34;

public class PrintingNumbers {

	public static void printNum(int num) {
		if (num >1)
			printNum(num - 1);
		System.out.print(num + " ");
	}

	public static void main(String[] args) {
		int n=100;
		 printNum(n);
	}
}
