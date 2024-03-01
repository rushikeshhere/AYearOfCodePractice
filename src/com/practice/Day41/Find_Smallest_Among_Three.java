package com.practice.Day41;

import java.util.Scanner;

public class Find_Smallest_Among_Three {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first Integer.!");
		int n1 = sc.nextInt();
		System.out.println("Enter Second Integer.!");
		int n2 = sc.nextInt();
		System.out.println("Enter Third Integer.!");
		int n3 = sc.nextInt();
		int smallest;
		if (n1 < n2 && n1 < n3)
			smallest = n1;
		else if (n2 < n3 && n2 < n1)
			smallest = n2;
		else
			smallest = n3;
		System.out.println("The Smallest Integer is :: " + smallest);
	}
}
