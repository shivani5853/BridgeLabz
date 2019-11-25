/******************************************************************************

 *  Purpose: Determines Tempreture convertion problem.
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

public class TempretureConvertion {
	public static void main(String[] args) {
		System.out.println("Enter the tempreture in celsius");
		int celsius = AlorithmUtility.inputInteger();
		int result = tempretureConversion(celsius);
		System.out.println(result);
	}

	/* Tempreture Convertion method */
	public static int tempretureConversion(int celsius) {
		int fahrenheit = (celsius * 9 / 5) + 32;
		System.out.println("Celsius to Fahrenheit " + fahrenheit);
		return fahrenheit;
	}
}
