package com.practice.Day37;

public class FinallyKeyword {
	public static void main(String[] args) {

		try {
			System.out.println("Hello,Rishikesh...");
		} catch (Exception e) {
			e.toString();
		} finally {
			System.out.println("Finally...Bye!");
		}
	}

}
