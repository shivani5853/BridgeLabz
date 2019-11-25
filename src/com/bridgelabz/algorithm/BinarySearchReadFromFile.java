/******************************************************************************

 *  Purpose: Binary Search the Word from Word List.Read in a list of words from File. Then prompt the user to enter a word to
			search the list. The program reports if the search word is found in the list.
 *
 *  @author  Shivani Kumari
 *  @version 1.0
 *  @since   26-10-2019
 *
 ******************************************************************************/

/*
 * PACKAGE NAME
 */
package com.bridgelabz.algorithm;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import utility.AlorithmUtility;

public class BinarySearchReadFromFile {
		public static void main(String[] args) throws IOException {
			File file=new File("/home/admin1/UnOrderedList");
			BufferedReader br=new BufferedReader(new FileReader(file));
			String str="";
			String st;
			System.out.println("Enter the no");
			String n=AlorithmUtility.inputString();
			boolean result = false;
			while((st=br.readLine())!=null)
			{
				str=str+st+"";
			System.out.println(str);
			result=binarysearch(str,n);
			}
			if(result)
			System.out.println(result);
			else
				System.out.println("not present in the list");
		}

		public static boolean binarysearch(String str, String n) {
			boolean result=false;
			char ch=str.charAt(0);
			for (int i = 0; i < ch; i++) {
				result = (n.equals(ch));
			}
				if (result)
					return true;
				
				else
					return false;
}
}