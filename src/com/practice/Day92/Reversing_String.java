package com.practice.Day92;

public class Reversing_String {
	public static void main(String[] args) {
		String str = "Java Programming";
		System.out.println("Original String is :: "+str);
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		System.out.println("After Reverse :: "+sb);
	}
}
