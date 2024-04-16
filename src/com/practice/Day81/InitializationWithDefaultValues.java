package com.practice.Day81;

public class InitializationWithDefaultValues {
	private boolean booleanMember;
	private int intMember;
	private String stringMember;
	private byte byteMember;
	private short shortMember;
	private double doubleMember;
	private float floatMember;
	private long longMember;
	private char charMember;

	public InitializationWithDefaultValues() {
		System.out.println("BooleanMember :: " + booleanMember);
		System.out.println("ByteMember :: " + byteMember);
		System.out.println("shortMember :: " + shortMember);
		System.out.println("IntegerMember :: " + intMember);
		System.out.println("LongMember :: " + longMember);
		System.out.println("CharMember :: " + charMember);
		System.out.println("FloatMember :: " + floatMember);
		System.out.println("doubleMember :: " + doubleMember);
		System.out.println("StringMember :: " + stringMember);
	}

	public static void main(String[] args) {
		InitializationWithDefaultValues iv=new InitializationWithDefaultValues();

	}

}
