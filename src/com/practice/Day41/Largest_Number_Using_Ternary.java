package com.practice.Day41;

import java.util.Scanner;

public class Largest_Number_Using_Ternary {
	public static void main(String[] args) {
		int n1, n2, n3;
		String result;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number :: ");
		n1 = sc.nextInt();
		System.out.println("Enter Second Number :: ");
		n2 = sc.nextInt();
		System.out.println("Enter Third Number :: ");
		n3 = sc.nextInt();
		result = (n1 > n2 && n1 > n3) ? "This is The Largest Number ::" + " " + n1
				: ((n2 > n3 && n2 > n1) ? "This is the Largest number :: " + n2
						: "This is the Largest Number  :: " + n3);
		System.out.println(result);
		sc.close();

	}

}
