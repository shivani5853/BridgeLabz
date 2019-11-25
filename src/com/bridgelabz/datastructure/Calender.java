/******************************************************************************

 *  Purpose: Calendar that takes the month and year as command-line arguments and prints the Calendar of the month. Store the Calendar in an 2D Array, the first dimension the week of the month and the second dimension stores the day of the week. Print the result as following.
 
 *  @author  Shivani Kumari
 *  @version 1.0
 *  @since   12-11-2019
 *
 ******************************************************************************/

/*
 * PACKAGE NAME
 */

package com.bridgelabz.datastructure;

/*
 * IMPORT STATEMENT
 */
import utility.DataStructureUtility;

public class Calender {
	public static void main(String[] args) {

		System.out.println("Enter month and year");
		int month = DataStructureUtility.inputInteger();
		int year = DataStructureUtility.inputInteger();
		DataStructureUtility.calender(month, year);

	}
}
