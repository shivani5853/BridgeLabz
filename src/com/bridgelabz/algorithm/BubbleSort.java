/******************************************************************************

 *  Purpose: Determines whethe the bubble sort or not
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

public class BubbleSort {
	public static void main(String[] args) {
		System.out.println("Enter the size of the array");
		int size = AlorithmUtility.inputInteger();
		int ar[] = new int[size];
		System.out.println("Enter the array elements");
		for (int i = 0; i < ar.length; i++) {
			ar[i] = AlorithmUtility.inputInteger();
		}
		AlorithmUtility.bubbleSort(ar);
	}
}
