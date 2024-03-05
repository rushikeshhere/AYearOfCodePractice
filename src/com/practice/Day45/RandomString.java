package com.practice.Day45;

import java.util.Random;

public class RandomString {
	public static void main(String[] args) {

		Random ran = new Random();
		 String alphabet = "abcdfghijklmnopqrstuvwxyz12345679";
		    for (int i = 0; i < 6; i++) {
		        System.out.print(alphabet.charAt(ran.nextInt(alphabet.length())));
		    } 
	}
}
