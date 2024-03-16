package com.practice.Day56;

import java.io.IOException;
import java.util.Scanner;

class Demo {
	public String toLower(String s) {
		String str = new String(s);
		return str.toUpperCase();
	}
}

public class Lower_To_Upper {
	public static void main(String[] args) throws IOException {
		System.out.println("Enter a String :: ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		Demo demo = new Demo();
		System.out.println(demo.toLower(s));
	}
}
