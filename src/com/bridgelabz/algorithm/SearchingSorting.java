/******************************************************************************

 *  Purpose: Determines serching sorting of stopwatch.
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

public class SearchingSorting {
	public static void main(String[] args) {
		System.out.println("Enter the s/S to start and e/E to stop the stopwatch");
		char characterStart = AlorithmUtility.inputString().charAt(0);
		AlorithmUtility.searchingSorting(characterStart);
	}
}
