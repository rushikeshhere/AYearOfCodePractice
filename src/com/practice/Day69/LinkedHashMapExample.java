package com.practice.Day69;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {
	public static void main(String[] args) {

		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>();
		lhm.put(101, "Rushikesh");
		lhm.put(102, "Rakesh");
		lhm.put(103, "Ramesh");
		lhm.put(103, "Rushi");
		lhm.put(105, "Kalpesh");
		lhm.put(106, "Durgesh");
		System.out.println(lhm);
	}
}
