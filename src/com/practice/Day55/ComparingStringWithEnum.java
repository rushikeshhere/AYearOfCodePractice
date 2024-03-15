package com.practice.Day55;

enum Day {
	Sunday, Monday, Tuesday, Wedenesday, Thursday, Friday, Saturday;
}

public class ComparingStringWithEnum {

	public static void compareString(String string) {
		Day day[] = Day.values();
		for (Day days : day) {
			System.out.println("Day :: " + days.name());
			if (days.name().equals(string))
				System.out.println("Equal");
			else
				System.out.println("Not Equal.");
		}
	}

	public static void main(String[] args) {
		compareString("Tuesday");
	}
}
