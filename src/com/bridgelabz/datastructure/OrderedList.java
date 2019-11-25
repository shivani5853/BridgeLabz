/******************************************************************************

 *  Purpose: Read a List of Numbers from a file and arrange it ascending Order in a Linked List. Take user input for a number, if found then pop the number out of the list else insert the number in appropriate position

 *  @author  Shivani Kumari
 *  @version 1.0
 *  @since   6-11-2019
 *
 ******************************************************************************/

/*
 * PACKAGE NAME
 */
package com.bridgelabz.datastructure;

import java.io.IOException;
import utility.DataStructureUtility;

public class OrderedList {
	public static void main(String[] args) throws IOException {
		System.out.println("Enter the number");
		String searchNumber = DataStructureUtility.inputString();
		boolean check = DataStructureUtility.checkStringNumber(searchNumber);
		if (check)
			try {
				DataStructureUtility.orderedList(searchNumber);
			} catch (Exception e) {
				System.out.println("Invalied Number");
			}
		else {
			System.out.println("Invalied Number");
		}

	}
}
