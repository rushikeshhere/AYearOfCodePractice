package com.practice.Day80;

import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args) {

		char ch[] = { 'a', 'g', 'j', 't', 'z' };
		char find = 't';
		int search = Arrays.binarySearch(ch, find);
		System.out.println(search);
	}
}
