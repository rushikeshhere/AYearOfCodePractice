package com.practice.Day43;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Terms :: ");
		int number=sc.nextInt();
		int t1=0,t2=1,nextTerm;
		for(int counter=1;counter<=number;counter++) {
			System.out.printf("%d ",t1);
			nextTerm=t1+t2;
			t1=t2;
			t2=nextTerm;
		}
	}
}
