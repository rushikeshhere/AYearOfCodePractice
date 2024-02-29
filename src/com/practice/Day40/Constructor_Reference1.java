package com.practice.Day40;

import com.practice.Day40.Sample1.Interf3;

class Sample1 {
	Sample1(String s) {
		System.out.println("Sample class Constructor Execution with args :: " + s);
	}

	interface Interf3 {
		public Sample1 get(String s);
	}
}

public class Constructor_Reference1 {
	public static void main(String[] args) {
		Interf3 i = Sample1::new;
		i.get("Rishikesh");
	}
}
