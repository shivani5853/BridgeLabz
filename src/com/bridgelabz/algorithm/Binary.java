/******************************************************************************

 *  Purpose: Write Binary.java to read an integer as an Input, convert to Binary using toBinary function and perform the following functions.
			Swap nibbles and find the new number.
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

/*
 * IMPORT STATEMENT
 */
import utility.AlorithmUtility;

public class Binary {
	public static void main(String[] args) {
		System.out.println("Enter the number");
		int number=AlorithmUtility.inputInteger();
		int result=AlorithmUtility.swapNibble(number);
		System.out.println(result);
	}
}