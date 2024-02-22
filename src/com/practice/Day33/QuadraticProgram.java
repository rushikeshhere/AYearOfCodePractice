package com.practice.Day33;

public class QuadraticProgram {
	public static void main(String[] args) {

		int a = 1;
		int b = 0;
		int c = -25;
		int root1, root2;
		int realPart, imaginary;

		double dec = (b * b) - (4 * a * c);

		if (dec > 1) {
			root1 = (int) (-b + Math.sqrt(dec) / 2 * a);
			root2 = (int) (-b - Math.sqrt(dec) / 2 * a);
			System.out.println("Roots are :: " + root1 + " , " + root2);
		} else if (dec == 0) {
			root1 = (int) (-b + Math.sqrt(dec) / 2 * a);
			root2 = root1;
			System.out.println("Roots are :: " + root1 + " , " + root2);
		} else {
			realPart = -b / (2 * a);
			imaginary = (int) Math.sqrt(dec) / (2 * a);
			System.out.format("root1 = %d + i(%d)\n", realPart, imaginary);
			System.out.format("root2 = %d - i(%d)\n", realPart, imaginary);
		}

	}
}
