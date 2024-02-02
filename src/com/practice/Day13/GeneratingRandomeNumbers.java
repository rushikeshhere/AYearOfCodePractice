package com.practice.Day13;

import java.util.Random;

public class GeneratingRandomeNumbers {
	public static void main(String[] args) {

		Random r = new Random();

		for (int i = 1; i <= 100; i++) {
			System.out.println(i + ") " + r.nextInt(100));
		}
	}
}
