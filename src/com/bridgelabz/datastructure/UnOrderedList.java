/******************************************************************************

 *  Purpose: Determines Unordered List Problem.
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

/*
 * IMPORT STATEMENTS
 */
import java.io.IOException;
import utility.DataStructureUtility;

public class UnOrderedList {
	public static void main(String[] args) throws IOException {

		System.out.println("Enter the word to be search, when word is present it will delete "
				+ "\n when word is not present it will add on the line");
		String userInput = DataStructureUtility.inputString();
		char characterArray[] = userInput.toCharArray();
		boolean checkResult = DataStructureUtility.checkCharacter(characterArray);
		if (checkResult) {
			DataStructureUtility.unOrdered(userInput);
		} else {
			System.out.println("Invalied Character");
		}
	}
}
