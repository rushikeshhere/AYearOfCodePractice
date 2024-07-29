package com.practice.Day109;

public class Demo {
	public static  void doSomting(String numberString) {
		
		try {
			int i=Integer.parseInt(numberString);
			System.out.println("String is Converted into Number :: "+i);
		}catch(Exception e) {
			System.out.println("String is not Converted into Number");
		}
	}
	public static void main(String[] args) {
		doSomting("78");
	}
}
