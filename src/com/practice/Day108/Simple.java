package com.practice.Day108;

public class Simple {
	
	    public static void main(String[] args) {
	        int x = 5;
	        int y = 10;
	        // checked Precedence 
	        System.out.println(y++);
	        // here is the calculation
	        // if ++ is first than variable then number will increment
	        int result = ++x * y--;
	        System.out.println(result);
	    }
	}


