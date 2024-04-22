package com.practice.Day87;

import java.util.HashMap;
import java.util.Map;

public class Converting_String_To_Map {
	public static void main(String[] args) {
		String data = "Apple:1, Banana:2, Mango:3";
		Map<String, String> map = new HashMap<String, String>();

		String fruits[] = data.split(",");
		for (String fruit : fruits) {
			String string1[] = fruit.split(":");
			String string2 = string1[0].trim();
			String string3 = string1[1].trim();
			map.put(string2, string3);
		}

		System.out.println("String: " + data);
		System.out.println("Map: " + map);

	}

}
