package com.practice.Day90;

import java.util.Scanner;

public class Area_Of_Circle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A radius..");
		float radius = sc.nextFloat();
		double area = 0.0;
		area = Math.PI * (radius * radius);
		System.out.println("The Radius of Circle is :: " + area);
		sc.close();
	}
}
