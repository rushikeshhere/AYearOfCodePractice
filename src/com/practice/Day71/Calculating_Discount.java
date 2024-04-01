package com.practice.Day71;

public class Calculating_Discount {
	public static void main(String[] args) {

		int marketPrice = 1000;
		float discount = 25f;

		System.out.println("MarketPrice :: " + marketPrice);
		System.out.println("Discount :: " + discount);
		double s=100-discount;
		double result = s*marketPrice/100;
		System.out.println("Amount After Discount :: "+result);
	}
}
