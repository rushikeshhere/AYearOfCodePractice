package com.practice.Day41;

import java.util.Scanner;

public class Finding_All_Divisor {
	public static void divisor(int number) {
		for(int divisor=1;divisor<=number;divisor++) {
			if(number%divisor==0) 
				System.out.print(divisor+" ");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to cheak All posible Divisor :: ");
		int num= sc.nextInt();
		divisor(num);
		sc.close();
	}
}
