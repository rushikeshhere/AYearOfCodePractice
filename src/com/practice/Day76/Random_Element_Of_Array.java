package com.practice.Day76;

import java.util.Random;

public class Random_Element_Of_Array {
	public static void main(String[] args) {
		String str[]= {"java","python","c++","C#","Ruby"};
		String nextElement= str[new Random().nextInt(str.length)];
		System.out.println(nextElement);
	}
}
