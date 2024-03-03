package com.practice.Day43;

import java.util.Scanner;

public class KM_To_Miles {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Kilometer to convert into the Miles...");
			int km=sc.nextInt();
			double miles=km*0.62137;
			System.out.println("The Kilometer in miles is :: "+miles);
			sc.close();
	}
}