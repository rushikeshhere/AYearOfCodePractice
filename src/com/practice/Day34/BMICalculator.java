package com.practice.Day34;

import java.util.Scanner;

public class BMICalculator {
	public static String bmiCalc(Double weight, Double height) {
		double bmi = weight / (height * height);

		if (bmi < 18.5)
			return "Thickness";
		else if (bmi < 25)
			return "Normal";
		else if (bmi < 30)
			return "OverWeight";
		else
			return "Obese";

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter you Weight ::");
		double weight = sc.nextDouble();
		System.out.println("Enter you height in meters :: ");
		double height = sc.nextDouble();
		String result = bmiCalc(weight, height);
		System.out.println(result);
	}

}
