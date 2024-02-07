package com.practice.Day18;

public class String_Array_Example_UsingAdvanceForLoop {
	public static void main(String[] args) {

		String[] names = new String[4];
		names[0] = "Rushikesh";
		names[1] = "Pavan";
		names[2] = "Rakesh";
		names[3] = "Rajesh";
		
		for(String s:names) {
			System.out.print(s+" ");
		}
	}
}
