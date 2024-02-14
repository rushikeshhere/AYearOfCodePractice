package com.practice.Day25;

public class DisplayASCII {
	public static void main(String[] args) {
		char ch = 'a';
		System.out.println(ch + " : " + (int) ch);

		char ch1 = 'A';
		int a = ch1;
		System.out.println(ch1 + " : " + a);

		for (char i = 'a'; i <= 'z'; i++) {
			System.out.print(i + "=" + (int) i);
			System.out.print(",\t");
		}
	}

}
