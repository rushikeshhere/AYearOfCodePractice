package com.practice.Day27;

public class UsingStringBuffer {
	public static void main(String[] args) {
		String name = "Rushikesh";
		StringBuffer sbf = new StringBuffer(name);
		sbf.reverse();
		System.out.println(sbf);
	}

}
