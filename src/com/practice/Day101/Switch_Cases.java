package com.practice.Day101;

public class Switch_Cases {
	public static void main(String[] args) {

		char grade = 'P';
		switch (grade) {
		case 'A':
			System.out.println("Awesoome!");
			break;
		case 'B':
			System.out.println("Good!");
			break;
		case 'C':
			System.out.println("Average!");
			break;
		case 'D':
			System.out.println("Okay!");
			break;
		case 'E':
			System.out.println("Barely!");
			break;
		case 'F':
			System.out.println("Fail!");
			break;
		default:
			System.out.println("Sorry, check grade!");
		}
	}

}
