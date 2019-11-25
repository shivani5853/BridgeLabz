/******************************************************************************

 *  Purpose: Determines whether  One string is an anagram of another if the second is simply a rearrangement of the first.
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

/*
 * IMPORT STATEMENTS 
 */
import utility.AlorithmUtility;

public class Anagram {
	public static void main(String[] args) {
		//CALLING SCANNER
		System.out.println("Enter two string");
		System.out.println("StringOne:");
		String userInputOne=AlorithmUtility.inputString();//TAKING INPUT FROM USER
		System.out.println("StringTwo:");
		String userInputTwo=AlorithmUtility.inputString();//TAKING INPUT FROM USER
		boolean result=AlorithmUtility.isAnagram(userInputOne, userInputTwo);
		if(result==true)
			System.out.println("Two string are Anagram");
		else
			System.out.println("Two string are not Anagram");
		}
}
