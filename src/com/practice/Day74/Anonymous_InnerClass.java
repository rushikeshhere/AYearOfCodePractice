package com.practice.Day74;

abstract class Test {
	abstract void fun();
}

public class Anonymous_InnerClass {
	public static void main(String[] args) {
		Test t= new Test() {
			void fun() {
				System.out.println("Lets play Cricket!");
			}
		};
		t.fun();
	}
}
