package com.practice.Day88;

public class SimpleInterest {
	public static void main(String[] args) {
		int principleAmount = 12000;
		float interestRate = 4.5f;
		int time = 4;// time in month
		double simpleInterest = (principleAmount * interestRate * time) / 100;
		System.out.println("The Total interest is : " + simpleInterest);
	}
}
