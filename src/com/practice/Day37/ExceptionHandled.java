package com.practice.Day37;

public class ExceptionHandled {
	public static void main(String[] args) {
		try {
			System.out.println("Hello...");
			System.out.println(10 / 0);
		} catch (Exception e) {
			System.out.println("Exception Catched...");
		} finally {
			System.out.println("Finally...");
		}
	}
}
