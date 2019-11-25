package com.bridgelabz.functional;

import utility.FunctionalUtility;

public class FlipCoin {
	public static void main(String[] args) {
		System.out.println("Enter the number");
		int num = FunctionalUtility.inputInteger();
		int head = 0;
		int tails = 0;
		boolean result = false;
		for (int i = 0; i < num; i++) {
			result = FunctionalUtility.flipCoin();
			if (result == false)
				head++;
			else
				tails++;
		}
		double headPer = (head * 100) / num;
		double tailsPer = (tails * 100) / num;

		System.out.println("Head Percentage is " + headPer + "\n Tails percentage is " + tailsPer);
	}
}
