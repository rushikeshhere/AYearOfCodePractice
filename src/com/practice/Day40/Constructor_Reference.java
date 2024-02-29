package com.practice.Day40;

class Sample {
	Sample() {
		System.out.println("Constructo Excecution ..");
	}
}

interface Interf2 {
	public Sample get();
}

public class Constructor_Reference {
	public static void main(String[] args) {
		
		Interf2 i=Sample::new;
		Sample s1=i.get();
	}
}
