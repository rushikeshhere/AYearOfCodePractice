package com.practice.Day108;

public class ShortenNameUsingCondition {
	public static String shortenName(String name,int maxLength) {
		// checked name is not
		/*if(name==null || name.length()<=maxLength)
			return name;*/
		// This is then one way to understand condition
		if(name==null || name.length()<=maxLength)
			return "Pass a String to truncate";
		return 	name.substring(0, maxLength)+"....";
	}
	
	
	public static void main(String[] args) {
		String name="";
		int maxLength=7;
		System.out.println(shortenName(name, maxLength));
		
	}


}
