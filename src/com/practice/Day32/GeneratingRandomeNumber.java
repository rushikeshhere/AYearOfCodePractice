package com.practice.Day32;

import java.util.Random;

public class GeneratingRandomeNumber {
	public static void main(String[] args) {

		Random random = new Random();
		int num=random.nextInt(1000);
		System.out.println(num);
	}
}
