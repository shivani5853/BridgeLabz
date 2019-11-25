/******************************************************************************

 *  Purpose: A binary tree is a binary search tree (BST) if all the non-empty nodes follows both two properties:
 
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
 * IMPORT STATEMENT
 */
import utility.DataStructureUtility;

public class BinarySearchTree {
	public static void main(String[] args) {
		System.out.println("Enter the total number");
		double number = DataStructureUtility.inputDouble();// taking user input

		while (number > 0) {
			System.out.println("Enter the total number of nodes");
			double totalNodes = DataStructureUtility.inputDouble();// taking user input
			double totalTree = DataStructureUtility.numberOfBinarySearchTree(totalNodes);// calling the method
			System.out.println(totalTree);
			number--;
		}
		System.out.println("Invalied Character");// when condition false
	}
}
