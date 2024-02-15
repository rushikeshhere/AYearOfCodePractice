package com.practice.Day26;

public class AreaOfRectangleUsingMethod {
	public static double areaOfRectangle(double length, double width) {
		return length * width;
	}

	public static void main(String[] args) {
		double area = areaOfRectangle(5, 3.2);
		System.out.println("Area of Rectangle is :: " + area);
	}
}
