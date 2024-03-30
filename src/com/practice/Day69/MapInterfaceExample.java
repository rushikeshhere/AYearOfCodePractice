package com.practice.Day69;

import java.util.HashMap;
import java.util.Map;

public class MapInterfaceExample {
	public static void main(String[] args) {
		Map<Integer, String> string = new HashMap<Integer, String>();
		string.put(101, "Rushikesh");
		string.put(102, "Rakesh");
		string.put(103, "Ramesh");
		string.put(104, "Rushi");
		string.put(105, "Kalpesh");
		string.put(106, "Durgesh");
		System.out.println(string);
		for (Map.Entry m : string.entrySet()) {
			System.out.println(m.getKey() + " -- " + m.getValue());
		}
	}
}
