/******************************************************************************

 *  Purpose:  Program which creates Banking Cash Counter where people come in to deposit Cash
 *  and withdraw Cash. Have an input panel to add people to Queue to either deposit or withdraw
 *   money and dequeue the people. Maintain the Cash Balance.
 *
 *  @author  Shivani Kumari
 *  @version 1.0
 *  @since   7-11-2019
 *
 ******************************************************************************
/*
 * PACKAGE NAME
 */
package com.bridgelabz.datastructure;

/*
 * IMPORT STATEMENTS
 */
import utility.DataStructureUtility;

public class BankingCashCounter {
	public static void main(String[] args) {
		System.out.println("Enter the number of person");
		int noOfPerson = DataStructureUtility.inputInteger();
		int cashLeft = DataStructureUtility.bankingCashCounter(noOfPerson);
		System.out.println("Remaining Balance " + cashLeft);
	}
}
