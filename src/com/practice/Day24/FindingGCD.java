package com.practice.Day24;

public class FindingGCD {
	 public static int findHCF(int num1, int num2) {
		    while (num1 != num2) {
		      if (num1 > num2)
		        num1 = num1 - num2;
		      else
		        num2 = num2 - num1;
		    }
		    return num1;
		  }
	public static void main(String[] args) {
		int array[] = { 12, 14, 16, 18, 20 };
		int result = array[0];
		    
		    // loop
		    for(int i=1; i<array.length; i++) {
		      result = findHCF(result, array[i]);
		    }
		    
		    // display result
		    System.out.println("GCD = " + result);
	}
}
