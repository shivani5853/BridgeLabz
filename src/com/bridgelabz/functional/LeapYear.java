package com.bridgelabz.functional;

import utility.FunctionalUtility;

public class LeapYear {
	public static void main(String[] args) {
		System.out.println("Enter the year in four digit");
		int year = FunctionalUtility.inputInteger();
		int result = FunctionalUtility.checkDigit(year);
		if (result == 4) {
			boolean leap = FunctionalUtility.leapYear(year);
			if (leap) {
				System.out.println(year + " is a leap year");
			} else {
				System.out.println(year + " is not a leap year");
			}
		} else {
			System.out.println("your enter year is not four digit no");
		}

	}
}
