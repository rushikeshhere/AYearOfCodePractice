package com.practice.Day17;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetExample1 {
	
	public static void main(String[] args) {
		// Insertion order is preserved
		LinkedHashSet h=new LinkedHashSet();
		h.add("A");
		h.add("a");
		h.add("c");
		h.add("z");
		h.add("d");
		h.add("b");
		h.add(10);
		h.add(null);
		System.out.println(h );	// [A, a, c, z, d, b, 10, null]
	}

}
