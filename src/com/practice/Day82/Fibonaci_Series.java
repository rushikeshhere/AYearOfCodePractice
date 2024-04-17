package com.practice.Day82;

public class Fibonaci_Series {

	public static void main(String[] args) {

		int a = 0;
		int b = 1;
		int n = 0;
		int term = 7;
		int i = 1;
		while (i <= term) {
			System.out.print(a + "\t");
			n = a + b;
			a = b;
			b = n;
			i++;
		}
		System.out.println(n);
	}
}
