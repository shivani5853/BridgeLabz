/******************************************************************************

 *  Purpose:Binary Search the Word from Word List.Read in a list of words from File. Then prompt the user to enter a word to
			search the list. The program reports if the search word is found in the list.
 *
 *  @author  BridgeLabz
 *  @version 1.0
 *  @since   26-10-2019
 *
 ******************************************************************************/

/*
 * PACKAGE NAME
 */
package com.bridgelabz.algorithm;

/*
 * IMPORT STATEMENT
 */
import java.util.Scanner;
import utility.AlorithmUtility;

public class BinarySearch {
	public static void main(String[] args) {
		Object scanner = AlorithmUtility.scanner();
		System.out.println("size of the words");
		int size = AlorithmUtility.inputInteger();
		String[] stringOne = new String[size];
		System.out.println("Enter the words");
		
		for (int i = 0; i < stringOne.length; i++) {
			stringOne[i] = ((Scanner) scanner).next();
		}
		System.out.println("Enter the word which you want to search");
		String word = AlorithmUtility.inputString();
		int result = AlorithmUtility.binarySearch(stringOne, word);
		if (result == -1)
			System.out.println("word not present");
		else
			System.out.println("word present at the position=" + result);
	}
}
