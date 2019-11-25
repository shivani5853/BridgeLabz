/******************************************************************************

 *  Purpose: A palindrome is a string that reads the same forward and backward, for example, radar, toot, and madam.
 *   We would like to construct an algorithm to input a string of characters and check whether it is a palindrome.
 
 *  @author  Shivani Kumari
 *  @version 1.0
 *  @since   8-11-2019
 *
 ******************************************************************************/

/*
 * PACKAGE NAME
 */
package com.bridgelabz.datastructure;

import utility.DataStructureUtility;

public class PalindromeCheckerOne {
	public static void main(String[] args) {
		System.out.println("Enter the word");
		String word = DataStructureUtility.inputString();
		boolean checkString = DataStructureUtility.checkString(word);
		if (checkString) {
			boolean result = DataStructureUtility.PalindromeCheckerViaDeque(word);
			if (result)
				System.out.println("Palindrame");
			else
				System.out.println("Not a Palindrame");
		} else
			System.out.println("Invalied Character!!! Please Enter word  ");
	}
}
