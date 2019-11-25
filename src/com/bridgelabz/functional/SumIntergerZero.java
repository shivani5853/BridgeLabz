package com.bridgelabz.functional;

import utility.FunctionalUtility;

public class SumIntergerZero{
public static void main(String[] args){
	System.out.println("Enter the array size");
	int size=FunctionalUtility.inputInteger();
	int ar[]=new int[size];
	System.out.println("Enter the array elements");
	for (int i = 0; i < ar.length; i++){
		ar[i]=FunctionalUtility.inputInteger();
	}
	FunctionalUtility.sumZero(ar,size);
	
}
}
