package com.practice.Day67;

public class Printing_Array_using_WhileLoop {
	public static void main(String[] args) {

		String arr[] = { "Java", "Python", "C", "C++", "Scala" };
		int i = 0;
		while (i < arr.length) {
			System.out.print(arr[i]+" ");
			i++;
		}
	}
}
