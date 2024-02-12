package com.practice.Day23;

import java.util.Arrays;

public class ComparingTwoArrays {
	public static void main(String[] args) {
		int array1[]= {10,20,30,40,50};
		int array2[]=array1;
		int array3[]= {10,20,30,40,50};
		int array4[]= {10,15,20,25,30,50};
		// compare arrays using == operator
	    // compare array1 and array2
	    if(array1 == array2)
	      System.out.println("array1 & array2 are same");
	    else 
	      System.out.println("array1 & array2 are not same");
	    
	    // compare array1 and array3
	    if(array1 == array3)
	      System.out.println("array1 & array3 are same");
	    else 
	      System.out.println("array1 & array3 are not same");
	    
	    // compare array1 and array4
	    if(array1 == array4)
	      System.out.println("array1 & array4 are same");
	    else 
	      System.out.println("array1 & array4 are not same");
	}
}
