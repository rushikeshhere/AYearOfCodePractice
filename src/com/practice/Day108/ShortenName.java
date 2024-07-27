package com.practice.Day108;

public class ShortenName {
	public static String shortenName(String name,int maxLength) {
		// checked name is not
//		if(name==null || name.length()<=maxLength)
//			return name;
		return 	name.substring(0, maxLength)+"....";
	}
	
	
	public static void main(String[] args) {
		String name="Rushikesh here";
		int maxLength=7;
		System.out.println(shortenName(name, maxLength));
		
	}

}
