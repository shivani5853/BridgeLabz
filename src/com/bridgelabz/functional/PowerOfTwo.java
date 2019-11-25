package com.bridgelabz.functional;

import utility.FunctionalUtility;

public class PowerOfTwo {
	public static void main(String[] args) {
		System.out.println("Enter the number");
		int num = FunctionalUtility.inputInteger();
		FunctionalUtility.powerOfTwo(num);
	}
}
