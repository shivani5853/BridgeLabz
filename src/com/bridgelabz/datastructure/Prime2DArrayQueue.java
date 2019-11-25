/******************************************************************************

 *  Purpose: Add the Prime Numbers that are Anagram in the Range of 0 - 1000 in a Queue using the Linked List and Print the Anagrams from the Queue. Note no Collection Library can be used.
 
 *  @author  Shivani Kumari
 *  @version 1.0
 *  @since   11-11-2019
 *
 ******************************************************************************/

/*
 * PACKAGE NAME
 */
package com.bridgelabz.datastructure;

/*
 * Import Staement
 */
import utility.DataStructureUtility;

public class Prime2DArrayQueue {
	public static void main(String[] args) {
		Queue<String> queue = new Queue<String>();
		String[] primeNumbers = DataStructureUtility.prime(1000);

		// prints prime numbers that are anagrams
		for (int i = 0; i < primeNumbers.length; i++) {
			for (int j = i + 1; j < primeNumbers.length; j++) {
				if (DataStructureUtility.anagram(primeNumbers[i], primeNumbers[j])) {
					queue.enqueue(primeNumbers[i]);
					queue.enqueue(primeNumbers[j]);
				}
			}
		}

		queue.display();
//			System.out.println("Anagrams in Reverse Ordeer :");
//			for(int i=numbers.length()-1;i>0;i--) {
//				System.out.print(numbers.charAt(i));
//			}
	}
}
