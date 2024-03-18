package com.practice.Day58;

public class Remove_Last_Char_From_String {
	public static void main(String[] args) {
		String str="Know Program";
		StringBuilder sb=new StringBuilder(str);
		sb.deleteCharAt(sb.length()-1);
		System.out.println(sb);
	}
}
