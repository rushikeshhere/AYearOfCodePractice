package com.practice.Day40;

interface Interf1 {
	public void add(int a, int b);
}

public class Method_Reference_Using_Lambda1 {
	public static void main(String[] args) {
		Interf1 i=(x,y)->System.out.println("The Sum :: "+(x+y));
		i.add(15, 20);
	}
}
