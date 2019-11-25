/******************************************************************************

 *  Purpose: Create a Slot of 10 to store Chain of Numbers that belong to each Slot to efficiently search a number from a given set of number

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
import java.io.IOException;
import utility.HashMapUtility;

public class HashingFunction {
	public static void main(String[] args) throws IOException {
		HashMapUtility<Integer> hash = new HashMapUtility<Integer>();
		for (int i = 0; i < 200; i++) {
			hash.add(i);
		}
		hash.display();
	}
}
