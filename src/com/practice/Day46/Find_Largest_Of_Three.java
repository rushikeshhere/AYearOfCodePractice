package com.practice.Day46;

import java.util.Scanner;

public class Find_Largest_Of_Three {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :: ");
		int a = sc.nextInt();
		System.out.println("Enter b number :: ");
		int b = sc.nextInt();
		System.out.println("Enter c number :: ");
		int c = sc.nextInt();
		if (a > b && a > c)
			System.out.println(a + ":: Is the Biggest Number.");
		else if (b > c && b > a)
			System.out.println(b + ":: Is the Biggest Number.");
		else
			System.out.println(c + ":: Is the Biggest Number.");
		sc.close();
	}
}
