package com.practice.Day90;

import java.util.Scanner;

public class Distance_of_two_Points {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x1, y1, x2, y2;
		double distance;
		System.out.println("Enter first Co-Ordinates :");
		x1 = sc.nextInt();
		y1 = sc.nextInt();
		System.out.println("Enter Second Co-Ordinates :");
		x2 = sc.nextInt();
		y2 = sc.nextInt();

		int x = x2 - x1;
		int y = y2 - y1;
		distance = Math.sqrt(x * x + y * y);
		System.out.println("The distance between two point is : " + distance);

	}
}
