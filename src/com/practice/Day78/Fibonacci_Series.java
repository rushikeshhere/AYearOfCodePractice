package com.practice.Day78;

import java.util.Scanner;

public class Fibonacci_Series {
	public static void main(String[] args) {
		int a=0;
		int a1=1;
		int n = 0;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a number :: ");
		int number=sc.nextInt();
		for(int i=1;i<=number;i++) {
			System.out.print(a+" ");
			n=a+a1;
			a=a1;
			a1=n;
		}System.out.print(n);
	}

}
