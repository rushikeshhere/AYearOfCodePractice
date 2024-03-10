package com.practice.Day50;

import java.text.CharacterIterator;
import java.text.StringCharacterIterator;

public class Iterating_String_Using_Iterator {
	public static void main(String[] args) {
		String str = "Java Programming";
		CharacterIterator iterator = new StringCharacterIterator(str);
		while (iterator.current() != CharacterIterator.DONE) {
			System.out.print(iterator.current() + " ");
			iterator.next();
		}
	}
}
