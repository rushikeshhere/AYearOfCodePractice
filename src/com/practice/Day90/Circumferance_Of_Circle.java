package com.practice.Day90;

import java.util.Scanner;

public class Circumferance_Of_Circle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A radius..");
		float radius = sc.nextFloat();
		double circumferance = 0.0;
		circumferance = 2 * Math.PI * radius;
		System.out.println("The circumferance of the Circle is :: " + circumferance);
		sc.close();
	}
}
