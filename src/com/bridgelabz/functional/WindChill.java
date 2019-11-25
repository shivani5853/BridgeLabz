package com.bridgelabz.functional;

import utility.FunctionalUtility;

public class WindChill {
	public static void main(String[] args) {
		System.out.println("Enter the tempreture and velocity value");
		double tempreture=FunctionalUtility.inputDouble();
		double velocity=FunctionalUtility.inputDouble();
		double weather=35.74+0.6215*tempreture+(0.4275*tempreture-35.75)*Math.pow(velocity,0.18);
		System.out.println(weather);
	}
}
