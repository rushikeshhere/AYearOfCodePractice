package com.practice.Day25;

public class ConversionStringIntoEnum {
	enum Color {
		Red, Black, Yellow;
	}

	public static void main(String[] args) {
		Color color=Color.valueOf("Red");
		System.out.println(color);// Red
		System.out.println(color==Color.Black);// false
	}

}
