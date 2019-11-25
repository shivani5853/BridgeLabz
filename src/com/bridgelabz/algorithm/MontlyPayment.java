/******************************************************************************

 *  Purpose: Determines Montly Payment Problem.
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

public class MontlyPayment {
	public static void main(String[] args) {
		System.out.println("Enter the Principle,Year and Rate");
		double principle = AlorithmUtility.inputDouble();
		int year = AlorithmUtility.inputInteger();
		int rate = AlorithmUtility.inputInteger();
		AlorithmUtility.montlyPayment(principle, year, rate);
	}
}
