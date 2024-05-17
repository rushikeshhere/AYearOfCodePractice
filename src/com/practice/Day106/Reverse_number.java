package com.practice.Day106;

public class Reverse_number {
	public static void main(String[] args) {
		int num=123;
		
		while(num!=0) {
			int rem=num%10;
			System.out.print(rem);
			num=num/10;
		}
	}

}
