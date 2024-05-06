package com.practice.Day97;

class Bank {
	int getRateOfInterest() {
		return 0;
	}
}

class SBI extends Bank {
	int getRateOfInterest() {
		return 8;
	}
}

class ICICI extends Bank {
	int getRateOfInterest() {
		return 7;
	}
}

class UnionBank extends Bank {
	int getRateOfInterest() {
		return 6;
	}
}

public class Method_Overriding {
	public static void main(String[] args) {
		SBI sbi = new SBI();
		ICICI icici = new ICICI();
		UnionBank ub = new UnionBank();

		System.out.println("The Sbi Rate of Interest is : " + sbi.getRateOfInterest());
		System.out.println("The ICICI Rate of Interest is : " + icici.getRateOfInterest());
		System.out.println("The Union Bank Rate of Interest is : " + ub.getRateOfInterest());
	}
}
