/******************************************************************************

 *  Purpose: Determines Merge Sort problem.
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

public class MergeSort {
	public static void main(String[] args) {
		System.out.println("Enter the size");
		int size = AlorithmUtility.inputInteger();
		String str[] = new String[size];
		System.out.println("Enter the String elements");
		for (int i = 0; i < str.length; i++) {
			str[i] = AlorithmUtility.inputString();
		}
		int n1 = str.length - 1;
		AlorithmUtility.sort(str, 0, n1);
		AlorithmUtility.printElement(str);
	}
}
