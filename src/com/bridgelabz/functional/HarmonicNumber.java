package com.bridgelabz.functional;

import utility.FunctionalUtility;

public class HarmonicNumber {
	public static void main(String[] args) {
		System.out.println("Enter the Number upto which you wants to check harmonic");
		int num = FunctionalUtility.inputInteger();
		FunctionalUtility.harmonicNumber(num);
	}
}
