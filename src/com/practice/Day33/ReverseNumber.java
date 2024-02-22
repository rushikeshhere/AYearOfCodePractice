package com.practice.Day33;

public class ReverseNumber {
	public static void main(String[] args) {

		int num = 785;
		String str = Integer.toString(num);
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		System.out.println(sb);
	}

}
