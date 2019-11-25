/******************************************************************************

 *  Purpose: Determines Prime Anagram in 2D Array Problem.
 *
 *  @author  Shivani Kumari
 *  @version 1.0
 *  @since   26-10-2019
 *
 ******************************************************************************/

/*
 * PACKAGE NAME
 */

package com.bridgelabz.datastructure;

import utility.DataStructureUtility;

public class PrimeAnagram2DArray {
	public static void main(String[] args) {
		int size = 1000;
		int primeCount = 1;
		int count = 0;
		while (primeCount <= size) {
			if (DataStructureUtility.checkPrime(primeCount)) {
				count++;
			}
			primeCount++;
		}
		System.out.println();
		System.out.println("Anagram");
		int[] prime = new int[count];
		primeCount = 1;
		int loop = 0;
		while (primeCount <= size) {
			if (DataStructureUtility.checkPrime(primeCount)) {
				prime[loop] = primeCount;
				loop++;
			}
			primeCount++;
		}
		DataStructureUtility.primeAnagram2DArray(prime);
	}
}
