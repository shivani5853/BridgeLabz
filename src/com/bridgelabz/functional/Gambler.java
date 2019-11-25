package com.bridgelabz.functional;

import utility.FunctionalUtility;

public class Gambler {
	public static void main(String[] args) {
		System.out.println("Enter the stake value");
		int stake = FunctionalUtility.inputInteger();
		System.out.println("Enter the goal value");
		int goal = FunctionalUtility.inputInteger();
		System.out.println("Enter the number of times");
		int trails = FunctionalUtility.inputInteger();
		FunctionalUtility.gambler(trails, goal, stake);
	}
}
