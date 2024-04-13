package com.practice.Day80;

public class LCM_Of_Two_Numbers {
	public static void main(String[] args) {
		int a = 15;
		int b = 25;
		int gretest;
		if (a > b)
			gretest = a;
		else
			gretest = b;

		while (true) {
			if (gretest % a == 0 && gretest % b == 0)
				break;
			gretest++;
		}
		System.out.println("LCM of " + a + " and " + b + " : " + gretest);
	}
}
