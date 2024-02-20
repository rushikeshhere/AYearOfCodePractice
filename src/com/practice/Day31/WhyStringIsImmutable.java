package com.practice.Day31;

public class WhyStringIsImmutable {
	public static void main(String[] args) {
		String str1 = "java";
		String str2 = "java";
		System.out.println(str1 == str2);
		str1 = str1 + " j2ee";// concatination
		System.out.println(str1);
		str1 = str1.concat(" code");// Strings are immutable in java so assign it explictly
		System.out.println(str1);
		System.out.println(str1 == str2);
	}
}
