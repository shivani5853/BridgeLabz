package com.bridgelabz.functional;

import utility.FunctionalUtility;

public class Quadratic {
	public static void main(String[] args) {
		System.out.println("Enter the a,b and c value");
		double a = FunctionalUtility.inputDouble();
		double b = FunctionalUtility.inputDouble();
		double c = FunctionalUtility.inputDouble();
		FunctionalUtility.rootOfX(a, b, c);

	}
}
