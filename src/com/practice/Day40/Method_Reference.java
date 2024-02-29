package com.practice.Day40;

interface Interf {
	public void add(int a, int b);
}

public class Method_Reference {
	public static void sum(int x, int y) {
		System.out.println("The sum of tow Digits is :: " + (x + y));
	}

	public static void main(String[] args) {
		Interf i = Method_Reference::sum;
		i.add(15, 20);
	}
}
