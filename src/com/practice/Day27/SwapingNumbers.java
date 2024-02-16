package com.practice.Day27;

public class SwapingNumbers {
	public static void main(String[] args) {
		int x = 10;
		int y = 15;
		System.out.println("Before Swapping :: x=" + x + "\t y=" + y);
		x = x * y;
		y = x / y;
		x = x / y;
		System.out.println("Before Swapping :: x=" + x + "\t y=" + y);
	}
}
