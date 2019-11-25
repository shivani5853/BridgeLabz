package com.bridgelabz.functional;

import utility.FunctionalUtility;

public class Factors {
	public static void main(String[] args) {
		System.out.println("Enter the Number");
		int num = FunctionalUtility.inputInteger();
		FunctionalUtility.primeFactors(num);

	}
}
