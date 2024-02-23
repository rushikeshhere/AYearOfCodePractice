package com.practice.Day34;

import java.util.Scanner;

public class ElectricBillCalculator {
	public static double billCalc(double unit) {

		double fixedRate = 100;
		double rate0_100 = 6.30;
		double rate101_200 = 6.85;
		double rateMoreThan200 = 7.40;

		if (unit <= 100) {
			return fixedRate + (unit * rate0_100);
		} else if (unit <= 200) {
			return (fixedRate + (100 * rate0_100) + (unit - 100) * rate101_200);
		} else
			return fixedRate + (100 * rate0_100) + (100 * rate101_200) + ((unit - 200) * rateMoreThan200);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter unit which you Consumed :: ");
		double unit = sc.nextDouble();
		Double result = billCalc(unit);
		System.out.println("The Total Bill Amount is :: " + result);
		sc.close();
	}
}
