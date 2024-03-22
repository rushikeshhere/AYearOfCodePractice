package com.practice.Day62;

public class Converting_Integer_To_String2 {
	public static void main(String[] args) {
		Integer num = 1245678;
		StringBuilder sb = new StringBuilder();
		sb.append(num);
		String str = sb.toString();
		System.out.println("Converted Integer to String :: " + str);
	}
}
