package com.practice.Day63;

import java.util.Arrays;

public class Converting_String_to_IntArray {
	public static void main(String[] args) {
		String str = "[00,10,45,65,78,23,72,37]";
		String[] strArray = str.replaceAll("\\[", "").replaceAll("]", "").split(",");
		int[] array = new int[strArray.length];

		for (int i = 0; i < strArray.length; i++) {
			array[i] = Integer.valueOf(strArray[i]);
		}

		System.out.println("Integer array : " + Arrays.toString(array));
	}
}
