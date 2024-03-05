package com.practice.Day45;

public class ReversingArray_UsingCharArray {
	public static void main(String[] args) {
		String sname = "Rushikesh";
		String rev = "";
		System.out.println("The Original String is :: " + sname);
		char array[] = sname.toCharArray();
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.print(array[i]+" ");
			rev = rev + array[i];
		}
		System.out.println("\nThe Reversed String is :: " + rev);
	}
}
