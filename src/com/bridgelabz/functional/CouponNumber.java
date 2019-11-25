package com.bridgelabz.functional;

import utility.FunctionalUtility;

public class CouponNumber {
	public static void main(String[] args) {
		System.out.println("Enter the number");
		int number = FunctionalUtility.inputInteger();
		int count = FunctionalUtility.collect(number);
		System.out.println(count);
	}
}
