package com.practice.Day25;

import java.util.Scanner;

public class CircleArea {
	public static void main(String[] args) {
		// declare variables
		double radius = 0.0;
		double area = 0.0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the radius of circle:: ");
		radius = scan.nextDouble();
		area = Math.PI * radius * radius;
		System.out.println("Area of circle = " + area);
		scan.close();
	}
}
