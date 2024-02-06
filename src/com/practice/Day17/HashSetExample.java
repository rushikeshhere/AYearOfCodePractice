package com.practice.Day17;

import java.util.HashSet;

public class HashSetExample {
	
	public static void main(String[] args) {
		
		HashSet<Character> hs=new HashSet<Character>();
		hs.add('a');
		hs.add('b');
		hs.add('c');
		hs.add('g');
		hs.add('a');
		hs.add('d');
		hs.add('e');
		//hs.add(null);
		System.out.println(hs); //[a, b, c, d, e, g]
		hs.add('f');
		System.out.println(hs);	// [a, b, c, d, e, f, g]I	
	}
}
