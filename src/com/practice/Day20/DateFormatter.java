package com.practice.Day20;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatter {
	public static void main(String[] args) {
		LocalDate date=LocalDate.now();
		System.out.println(date.format(DateTimeFormatter.ISO_DATE)); //2024-02-09
	}
}
