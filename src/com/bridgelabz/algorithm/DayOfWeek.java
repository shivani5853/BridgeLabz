/******************************************************************************

 *  Purpose: Determines Days of week problem
 *
 *  @author  Shivani Kumari
 *  @version 1.0
 *  @since   26-10-2019
 *
 ******************************************************************************/

/*
 * PACKAGE NAME
 */

package com.bridgelabz.algorithm;

import utility.AlorithmUtility;

public class DayOfWeek {
	public static void main(String[] args) {
		System.out.println("Enter the month");
		int month = AlorithmUtility.inputInteger();
		System.out.println("Enter the date");
		int date = AlorithmUtility.inputInteger();
		System.out.println("Enter the year");
		int year = AlorithmUtility.inputInteger();
		AlorithmUtility.dayOfWeek(month, date, year);
	}
}
