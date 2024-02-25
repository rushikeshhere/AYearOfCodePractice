package com.practice.Day36;

public class AdditionOfArrayElement {
	public static void main(String[] args) {
		int marks[]= {40,60,78,65,15,86};
		int sum=0;
		for(int elements:marks) {
			sum=sum+elements;
			System.out.print(sum +", ");
		}
	}
}
