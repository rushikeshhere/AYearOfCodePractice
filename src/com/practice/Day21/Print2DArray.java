package com.practice.Day21;

public class Print2DArray {
	public static void main(String[] args) {
		int array[][]= {{10,20},{30,40},{50,60}};
		for(int i[] :array) {
			for(int j:i) {
				System.out.print(j+" ");
			}
		}
	}

}
