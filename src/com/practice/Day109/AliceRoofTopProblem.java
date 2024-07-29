package com.practice.Day109;



public class AliceRoofTopProblem {
	public static void main(String[] args) {
		
		int n=4;
		int a[]= {12,21,3,4};
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%3==0) 
				count++;
		}
		System.out.println("Number's of Houses roof, alice can climb : "+count);
	}

}
