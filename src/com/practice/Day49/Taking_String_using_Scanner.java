package com.practice.Day49;

import java.util.Scanner;

public class Taking_String_using_Scanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A String  :: ");
		String result = sc.nextLine();
		System.out.println(result);
		sc.close();
	}
}
