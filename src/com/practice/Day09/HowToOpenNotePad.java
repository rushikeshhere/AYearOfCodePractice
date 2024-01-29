package com.practice.Day09;

public class HowToOpenNotePad {
	public static void main(String[] args) {
		Runtime run = Runtime.getRuntime();
		try {
			run.exec("notepad");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
