package com.practice.Day73;

public class ReverseNumbers {
	public static void main(String[] args) {
		int a = 564;
		StringBuilder sb = new StringBuilder();
		sb.append(a);
		StringBuilder reverse = sb.reverse();
		System.out.println("Reverse Number :: " + reverse);
	}
}
