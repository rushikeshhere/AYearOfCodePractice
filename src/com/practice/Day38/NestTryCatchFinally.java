package com.practice.Day38;

public class NestTryCatchFinally {
	public static void main(String[] args) {
		try {
			System.out.println("Outer try block..");
			try {
				System.out.println("Inner try Block...");
				System.out.println(10 / 0);
			} catch (ArithmeticException e) {
				System.out.println("Inner Catch Block...");
			}System.out.println("Outside of inner try-catch block...");
		} catch (Exception e) {
			System.out.println("Outer catch Block..");
		} finally {
			System.out.println("Outer Finally Block..");
		}
	}
}
