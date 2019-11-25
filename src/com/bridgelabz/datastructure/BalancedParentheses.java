/******************************************************************************

 *  Purpose: BalancedParentheses
 *
 *  @author  Shivani Kumari
 *  @version 1.0
 *  @since   6-11-2019
 *
 ******************************************************************************/

/*
 * PACKAGE NAME
 */
package com.bridgelabz.datastructure;

/*
 * IMPORT STATEMENT
 */
import utility.DataStructureUtility;

public class BalancedParentheses {
	public static void main(String[] args) {
		DataStructureUtility utility = new DataStructureUtility();
		String string = "(5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3)";
		boolean balance = utility.balancedParentheses(string);
		if (balance) {
			System.out.println(string + ":- Not having Balanced Parentheses");
		} else {
			System.out.println(string + ":- having Balanced Parentheses");
		}
	}
}
