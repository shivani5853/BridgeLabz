package com.bridgelabz.functional;

import utility.FunctionalUtility;

public class Distance {
	public static void main(String[] args) {
		System.out.println("Enter the two points x,y");
		int pointx = FunctionalUtility.inputInteger();
		int pointy = FunctionalUtility.inputInteger();
		double result = FunctionalUtility.distance(pointx, pointy);
		System.out.println("The Ecludian Distance " + result);
	}
}
