package com.practice.Day21;

public class AverageOfArrayElements {
	public static void main(String[] args) {
		int[] array= {45,65,12,32,98,78};
		int sum=0;
		double avg=0.0;
		for(int i:array) {
			sum+=i;
		}
		System.out.println("Sum of Array Elements :: "+sum);
		avg=sum/array.length;
		System.out.println("The total Avg of the Array elements is :: "+ avg);
	}

}
