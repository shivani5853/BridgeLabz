/******************************************************************************

 *  Purpose: Add the Prime Numbers that are Anagram in the Range of 0 - 1000 in a Stack using the Linked List and Print the Anagrams in the Reverse Order. Note no Collection Library can be used.

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
 * IMPORT STATEMENTS
 */
import utility.DataStructureUtility;

public class PrimeAnagram2DArrayStack {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		String[] primeNumbers = DataStructureUtility.prime(1000);

		// prints prime numbers that are anagrams
		for (int i = 0; i < primeNumbers.length; i++) {
			for (int j = i + 1; j < primeNumbers.length; j++) {
				if (DataStructureUtility.anagram(primeNumbers[i], primeNumbers[j])) {
					stack.push(primeNumbers[i]);
					stack.push(primeNumbers[j]);
				}
			}
		}

		stack.display();
//			System.out.println("Anagrams in Reverse Ordeer :");
//			for(int i=numbers.length()-1;i>0;i--) {
//				System.out.print(numbers.charAt(i));
//			}
	}
}
