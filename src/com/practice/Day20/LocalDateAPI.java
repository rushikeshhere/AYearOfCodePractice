package com.practice.Day20;

import java.time.LocalDate;

public class LocalDateAPI {
	public static void main(String[] args) {
		LocalDate date=LocalDate.now();
		System.out.println(date); //2024-02-09
		LocalDate date1 = LocalDate.of(2017, 1, 13);   
		System.out.println(date1.isLeapYear());// false
	}

}
