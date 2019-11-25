/******************************************************************************

 *  Purpose: Determines strings are insertion sort.
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

public class InsertionSort {
	public static void main(String[] args) {
		System.out.println("Enter the string size");
		int size = AlorithmUtility.inputInteger();
		System.out.println("Enter the String");
		String str[] = new String[size];
		for (int i = 0; i < str.length; i++) {
			str[i] = AlorithmUtility.inputString();
		}
		AlorithmUtility.insertionSort(str);
	}
}
