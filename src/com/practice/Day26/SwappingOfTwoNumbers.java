package com.practice.Day26;

public class SwappingOfTwoNumbers {
	public static void main(String[] args) {
		int x = 10;
		int y = 15;
		int temp;
		System.out.println("Before Swapping :: x=" + x + "\t y=" + y);
		temp = x;
		x = y;
		y = temp;
		System.out.println("After Swapping :: x=" + x + "\t y=" + y);
	}
}
