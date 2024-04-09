package com.practice.Day77;

public class Switch_Test {
	public static void main(String[] args) {
		String str="Rushikesh";
		switch(str) {
		case "Ram":
			System.out.println("Ram is matched with str");
			break;
		case "Rushikesh":
			System.out.println("Rushikesh is matched with str");
			break;
			default:
				System.out.println("Looking Forword...");
		}
	}
}
