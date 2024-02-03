package com.practice.Day14;

import java.sql.Date;

public class SQLDateExample {

	public static void main(String[] args) {
		long mili=System.currentTimeMillis();
		Date date= new Date(mili);
		System.out.println(date);
	}
}
