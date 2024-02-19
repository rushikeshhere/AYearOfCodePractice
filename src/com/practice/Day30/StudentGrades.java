package com.practice.Day30;

public class StudentGrades {
	public static void main(String[] args) {

		String grades = null;
		int result = 45;
		switch (result / 10) {
		case 10:
		case 9:
			grades = "A";
			break;
		case 8:
			grades = "B";
			break;
		case 7:
			grades = "C";
			break;
		case 6:
			grades = "D";
			break;
		case 5:
			grades = "E";
			break;
		default:
			grades = "F";
			break;

		}
		System.out.println("Grades :: " + grades);
	}
}
