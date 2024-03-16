package com.practice.Day56;

import java.io.IOException;
import java.util.Scanner;

class Solution {
	public String toLower(String s) {
		String str = new String(s);
		return str.toLowerCase();
	}
}

public class ConvertingString_To_LowerCase {
	public static void main(String[] args) throws IOException{
		System.out.println("Enter a String :: ");
		Scanner sc= new Scanner(System.in);
		String s=sc.nextLine();
		Solution sol=new Solution();
		System.out.println(sol.toLower(s));
	}
}
