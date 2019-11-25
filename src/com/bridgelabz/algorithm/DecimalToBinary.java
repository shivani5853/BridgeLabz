/******************************************************************************

 *  Purpose: Determines Decimal to Binary convertion.
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

public class DecimalToBinary {
	public static void main(String[] args) {
		System.out.println("Enter the Decimal number");
		int number = AlorithmUtility.inputInteger();
		AlorithmUtility.toBinary(number);
	}
}
