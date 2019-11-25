package com.bridgelabz.functional;

import utility.FunctionalUtility;

public class StringPermutation
{
	public static void main(String[] args)
	{
		System.out.println("Enter the String");
		String str=FunctionalUtility.inputString();
		int length=str.length();
		FunctionalUtility. permutation(str,0,length-1);
		
	}
	
}
