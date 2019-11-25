/******************************************************************************
 *  Purpose: Utility 
 *  
 *  @author  Shivani Kumari
 *  @version 1.0
 *  @since   18-11-2019
 *
 ******************************************************************************/

/*
 * PACKAGE NAME
 */
package com.bridgelabz.objectorientedprogram.inventorymanagement.utility;

import java.util.Random;
import java.util.Scanner;

public class Utility {
	static Scanner scanner;
	static Random random;

	public Utility() {
		scanner = new Scanner(System.in);
		random = new Random();
	}

	/*
	 * Return Input Integer
	 */
	public static int inputInteger() {
		try {
			return scanner.nextInt();
		} catch (Exception e) {
			System.out.println("Invalied Input");
		}
		return 0;
	}

	/*
	 * Return Input Double
	 */
	public static double inputDouble() {
		try {
			return scanner.nextDouble();
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0.0;
	}

	/*
	 * Return Input String
	 */
	public static String inputString() {
		try {
			return scanner.next();
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}

	/*
	 * Return Input String
	 */
	public static String inputStringLine() {
		try {
			return scanner.nextLine();
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}

	/*
	 * Return Input Float
	 */
	public static float inputFloat() {
		try {
			return scanner.nextFloat();
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0L;
	}

	/*
	 * Return Input Boolean
	 */
	public static boolean inputBoolean() {
		try {
			return scanner.nextBoolean();
		} catch (Exception e) {
			System.out.println(e);
		}
		return false;
	}

	/*
	 * Check User Input Value is Number
	 */
	public static boolean checkNumber(int userNumber) {
		if (userNumber >= '0' && userNumber <= '9') {
			return true;
		} else {
			return false;
		}
	}

	/*
	 * Check User Input Value is String
	 */
	public static boolean checkString(String userString) {
		char ch[] = userString.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 'a' && ch[i] <= 'z' || ch[i] >= 'A' && ch[i] <= 'Z')
				return true;
		}
		return false;
	}

	/*
	 * Inventory Management
	 */
	public static boolean checkChoice(int choice) {
		if (choice == 0 || choice == 1 || choice == 2 || choice == 3 || choice == 4 || choice == 5 || choice == 6
				|| choice == 7) {
			return true;
		} else {
			return false;
		}

	}

	/*
	 * Check Choice for Rice Wheat
	 */
	public static boolean checkChoiceOne(int choice) {
		if (choice == 1 || choice == 2 || choice == 3) {
			return true;
		} else {
			return false;
		}
	}
}
