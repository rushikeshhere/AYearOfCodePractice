package com.practice.Day14;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class GetCurrentDateAndTime {
	public static void main(String[] args) {

		GregorianCalendar gc = new GregorianCalendar();
		int day, month, year;
		int second, minute, hour;

		day = gc.get(Calendar.DAY_OF_MONTH);
		month = gc.get(Calendar.MONTH);
		year = gc.get(Calendar.YEAR);

		second = gc.get(Calendar.SECOND);
		minute = gc.get(Calendar.MINUTE);
		hour = gc.get(Calendar.HOUR_OF_DAY);
		System.out.println("Current date is :: " + day + " / " + (month + 1) + " / " + year);
		System.out.println("Current time is :: " + hour + " : " + minute + " : " + second);
	}
}
