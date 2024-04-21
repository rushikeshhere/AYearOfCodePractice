package com.practice.Day86;

import java.util.UUID;

public class Random_String {
	public static void main(String[] args) {
		 UUID uuid = UUID.randomUUID();
	      String randomString = uuid.toString();
	      System.out.println("Random string: " + randomString);
	}

}
