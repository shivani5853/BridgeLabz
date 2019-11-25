/******************************************************************************

 *  Purpose: Determines Guessing Game Problem.
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

public class GuessGame {
	public static void main(String[] args) {
		System.out.println("Enter the number between 0 to 100");
		int number=AlorithmUtility.inputInteger();
		int numberOne=AlorithmUtility.guessNumber(number);
		if(numberOne==0)
		{
			System.out.println("Enter the correct number");
		}
		else
		{
			System.out.println("Guess number is "+numberOne);
		}
	}
}
