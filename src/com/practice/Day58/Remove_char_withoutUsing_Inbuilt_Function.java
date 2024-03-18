package com.practice.Day58;

public class Remove_char_withoutUsing_Inbuilt_Function {
public static void main(String[] args) {
	 String string = "Know Program";
     int i = 0;
     while (i < string.length()) {
        char ch = string.charAt(i);
        // remove 'g' from the string 
        if (ch == 'g') {
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
