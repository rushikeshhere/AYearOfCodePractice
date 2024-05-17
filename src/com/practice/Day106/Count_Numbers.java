package com.practice.Day106;

public class Count_Numbers {
	public static void main(String[] args) {
		int number=1234567;
		
		if(number<0)
			number*=-1;
		
		while(number!=0) {
			int remainder=number%10;
			System.out.print(remainder+" ");
			number=number/10;
		}
	}

}
