package com.practice.Day55;

import java.util.Arrays;

public class SliptStringUsingComma {
	public static void main(String[] args) {
		String str = new String("Everything is possible in this world but we need to have courage");
		String delim=" ";
		String arr[] = str.split(delim);
		System.out.println(Arrays.toString(arr));
	}
}
