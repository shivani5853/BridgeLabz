/******************************************************************************

 *  Purpose: Determines Vending Maching problem.
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

public class VendingMachine {
	public static void main(String[] args) {
		System.out.println("Enter the amount");
		int amount = AlorithmUtility.inputInteger();
		int result[] = countNote(amount);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]);
		}

	}

	/* Vending Machine method */
	public static int[] countNote(int amount) {
		int note[] = { 1000, 500, 100, 50, 10, 5, 2, 1 };
		int countNote[] = { 0, 0, 0, 0, 0, 0, 0, 0 };
		for (int i = 0; i < note.length; i++) {
			if (amount >= note[i]) {
				countNote[i] = amount / note[i];
				amount = amount % note[i];
			}
		}
		for (int i = 0; i < note.length; i++) {
			if (countNote[i] != 0) {
				System.out.println(note[i] + " " + countNote[i]);

			}
		}
		return countNote;

	}
}
