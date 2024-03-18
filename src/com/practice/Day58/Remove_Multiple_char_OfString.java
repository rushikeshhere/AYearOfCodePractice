package com.practice.Day58;

public class Remove_Multiple_char_OfString {
	public static void main(String[] args) {
		String string = "Know Program";
	      int i = 0;
	      while (i < string.length()) {
	         char ch = string.charAt(i);
	         if (ch == 'g' || ch == 'r' || ch == 'o') {
	            String s1 = string.substring(0, i);
	            String s2 = string.substring(i + 1);
	            string = s1 + s2;
	         } else {
	            i++;
	         }
	      }
	      System.out.println(string);
	}
}
