package com.practice.Day74;

interface Demo {
	public void eat();
}

class MyClass implements Demo {

	@Override
	public void eat() {
		// TODO Auto-generated method stub	
	}
}

public class Annonymous_Inner_Class_Test_using_interface {
	public static void main(String[] args) {
		MyClass m = new MyClass() {

			public void eat() {
				System.out.println("i Want to Eat Apple!");
			}
		};
		m.eat();
	}
}
