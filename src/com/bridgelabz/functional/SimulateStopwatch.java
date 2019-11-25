package com.bridgelabz.functional;

import java.time.LocalTime;

import utility.FunctionalUtility;

public class SimulateStopwatch {
	public static void main(String[] args) {
		System.out.println("Enter the s/S to start and enter e/E to end the stopwatch");
		char characterStart=FunctionalUtility.inputString().charAt(0);
		System.out.println(characterStart);
		if(characterStart=='s'||characterStart=='S')
		{
			System.out.println("Stopwatech startred");
			LocalTime time=java.time.LocalTime.now();
			int hourStart=time.getHour();
			int minuteStart=time.getMinute();
			int secondStart=time.getSecond();
			int nanoStart=time.getNano();
			char characterEnd=FunctionalUtility.inputString().charAt(0);
			if(characterEnd=='e'||characterEnd=='E')
			{
				System.out.println("Stopwatch End");
				LocalTime time1=java.time.LocalTime.now();
				int hourEnd=time1.getHour();
				int minuteEnd=time1.getMinute();
				int secondEnd=time1.getSecond();
				int nanoEnd=time1.getNano();
				
				//another method of time
				//int start=System.currentTimemills();
				
				int hour=hourEnd-hourStart;
				int minute=minuteEnd-minuteStart;
				int second=secondEnd-secondStart;
				int nano=nanoEnd-nanoStart;
				
				System.out.println(hour+" "+minute+" "+second+" "+nano);
			}
			else
			System.out.println("Invalied Character");
		}
		else
			System.out.println("Invalied Character");
	}
}
