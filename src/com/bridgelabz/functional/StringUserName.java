package com.bridgelabz.functional;

import utility.FunctionalUtility;

public class StringUserName 
{
	public static void main(String[] args)
	{
	System.out.println("Enter the Username");
	String stringOne=FunctionalUtility.inputString();
	String stringTwo="Hello <<UserName>>, how are you?";
	if(stringOne.length()>2)
	{
	String stringThree=stringTwo.replaceAll("<<UserName>>",stringOne);
	System.out.println(stringThree);
	}
	
	}
}
