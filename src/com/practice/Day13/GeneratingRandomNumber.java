package com.practice.Day13;

import java.util.Formatter;
import java.util.Random;

public class GeneratingRandomNumber {
	public static void main(String[] args) {
		float r = new Random().nextFloat(100);
		System.out.println(r);
		Formatter f = new Formatter();
		f.format("%.4f", r);
		System.out.println(f);
	}
}
