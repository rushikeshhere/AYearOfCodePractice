package com.practice.Day51;

public class CountVowelsInString {
	public static boolean findVowel(char ch) {
		if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		String str = "Java Programming";
		str = str.toUpperCase();
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (findVowel(str.charAt(i))) {
				count++;
			}
		}
		System.out.println("Number of vowels: "+count);
	}
}
