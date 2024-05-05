package com.practice.Day96;

public class Removing_all_Numbers_and_special {
	public static void main(String[] args) {
		String str="java@121";
		str=str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(str);
	}

}
