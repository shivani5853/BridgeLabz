/******************************************************************************

 *  Purpose: DataStructure Utility class
 *
 *  @author  Shivani Kumari
 *  @version 1.0
 *  @since   1-11-2019
 *
 ******************************************************************************/

/*
 * PACKAGE NAME
 */
package utility;

/*
 * IMPORT STATEMENT
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import com.bridgelabz.datastructure.Dequeue;
import com.bridgelabz.datastructure.LinkedList;
import com.bridgelabz.datastructure.Queue;
import com.bridgelabz.datastructure.Stack;

/*
 * class Start
 */
public class DataStructureUtility {
	static Scanner scanner;//Taken Scanner as static 
	static Random random;	//Taken Random as static

	/*
	 * constructor 
	 */
	public DataStructureUtility()
	{
		//creating the object
		scanner = new Scanner(System.in);
		random = new Random();
	}

	/*
	 * returns InputString
	 */
	public static String inputString()
	{
		try {
			return scanner.next();
		}
		catch (Exception e) {
			System.out.println(e);
		}
		return "";
	}

	/*
	 * returns InputStringLine
	 */
	public static String inputStringLine()
	{
		try {
			return scanner.nextLine();
		}
		catch (Exception e) {
			System.out.println(e);
		}
		return "";
	}

	/*
	 *  returns InputInteger
	 */
	public static int inputInteger()
	{
		try {
			return scanner.nextInt();
		}
		catch (Exception e) {
			System.out.println(e);
		}
		return 0;
	}

	/*
	 *  returns InputDouble
	 */
	public static double inputDouble()
	{
		try {
			return scanner.nextDouble();
		}
		catch (Exception e) {
			System.out.println(e);
		}
		return 0.0;
	}

	/*
	 *  returns InputBoolean
	 */
	public static boolean inputBoolean()
	{
		try {
			return scanner.nextBoolean();
		}
		catch (Exception e) {
			System.out.println(e);
		}
		return false;
	}

	/*
	 * UnOrdered List
	 */
	public static boolean checkCharacter(char[] character)
	{
		for (int i = 0; i <character.length; i++) {
			if(character[i]>='a'&&character[i]<='z'||character[i]>='A'&&character[i]<='Z')
			{
				return true;
			}
		}
		return false;

	}
	public static void unOrdered(String inputString) throws IOException
	{
		String st;
		LinkedList<String> list=new LinkedList<String>();
		File file=new File("/home/admin1/UnOrderedList");
		BufferedReader br=new BufferedReader(new FileReader(file));
		String str="";
		while((st=br.readLine())!=null)
		{
			str=str+st+"";
		}
		br.close();
		for (String fs: str.split("\\s", 0)) {
			list.add(fs);

			System.out.println("Before Search Elements");
			list.display();

			boolean bool=list.search(inputString);
			if(bool)
			{
				list.delet(inputString);
			}
			else
			{
				list.add(inputString);
			}
			System.out.println("After search Elements");
			list.display();
		}
	}

	/*
	 * Ordered List
	 */
	public static boolean checkStringNumber(String userInput)
	{
		char ch[]=userInput.toCharArray();
		for (int i = 0; i <ch.length; i++) {
			if(ch[i]>='0'&&ch[i]<='9')
			{
				return true;
			}
		}

		return false;

	}
	
	public static void orderedList(String inputNumber) throws IOException
	{
		String number;
		LinkedList<String> list=new LinkedList<String>();
		File file=new File("/home/admin1/OrderedList");
		BufferedReader br=new BufferedReader(new FileReader(file));
		String str="";
		while((number=br.readLine())!=null)
		{
			str=str+number+" ";
		}
		br.close();
		for (String fs: str.split("\\s", 0)) {
			list.add(fs);
			System.out.println("Before Search Elements");
			list.display();

			boolean bool=list.search(inputNumber);
			if(bool)
			{
				list.delet(inputNumber);
			}
			else
			{
				list.add(inputNumber);
			}
			System.out.println("After search Elements");
			list.display();
		}
	}

	/*
	 * Check BalancedParentheses
	 */
	public static boolean balancedParentheses(String str)
	{
		Stack<Character> stack=new Stack<Character>();
		for (int i = 0; i < str.length(); i++) {
			char bracket=str.charAt(i);
			if(bracket=='(')
			{
				stack.push(bracket);
			}
			else if(bracket==')')
			{
				stack.pop();
			}
			if(bracket=='{')
			{
				stack.push(bracket);
			}
			else if(bracket=='}')
			{
				stack.pop();
			}if(bracket=='[')
			{
				stack.push(bracket);
			}
			else if(bracket==']')
			{
				stack.pop();
			}
		}
		boolean balance=stack.isEmpty();
		return balance;

	}

	/*
	 * Banking cash counter
	 */
	public static boolean checkNumber(int noOfPerson)
	{
		
		if(noOfPerson==0||noOfPerson==1||noOfPerson==2||noOfPerson==3||noOfPerson==4||noOfPerson==5||noOfPerson==6||noOfPerson==7||noOfPerson==8||noOfPerson==9)
		{
			return true;
		}
		return false;
	}

	
	public static int bankingCashCounter(int noOfPerson)
	{
		int cash=100000;
		Queue<Integer> queue=new Queue<Integer>();
		for (int i =1; i <=noOfPerson; i++) {
			queue.enqueue(i);
		}

		while(noOfPerson!=0)
		{
			System.out.println("Cash present "+cash);
			int count=0,option=0;

			while(count==0)
			{
				System.out.println("\nEnter option \n1.Withdrawal\n2.Deposit");
				option=inputInteger();
				if(option==1)
				{
					count+=1;
				}
				else if(option==2) {
					count+=2;
				}
				else {
					System.err.println("Invalied Option");
				}
			}

			if(count==1)
			{
				int amount1=0;
				int countWithdrawal=0;
				while(countWithdrawal==0)
				{
					System.out.println("Enter the amount to be Withdrawal:");
					amount1=inputInteger();

					if(amount1>cash)
						System.err.println("Sorry, you Enter wrong amount\n");	
					else
						cash=cash-amount1;
					countWithdrawal++;
				}
				queue.dequeue();
			}
			else if(option==2)
			{
				int amount2=0;
				int countdeposit=0;
				while(countdeposit==0)
				{
					System.out.println("Enter the Deposited amount:");
					amount2=inputInteger();
					countdeposit++;
					if(amount2<0)
						System.err.println("Your enter amount is not valied\n");
					else
						cash=cash+amount2;
				}
				queue.dequeue();
			}
			noOfPerson--;
		}
		return cash;
	}

	/*
	 * Cheking Palindrome using Dequeue
	 */

	public static boolean checkString(String string)
	{
		char ch[]=string.toCharArray();
		for (int i = 0; i <ch.length; i++) {
			if(ch[i]>='A'&&ch[i]<='Z'||ch[i]>='a'&&ch[i]<='z')
			{
				return true;
			}
		}
		return false;
	}

	public static boolean PalindromeCheckerViaDeque(String word) {
		Dequeue<Character> dequeue=new Dequeue<Character>();
		char wordCharacter[]=word.toCharArray();

		for (int i = 0; i < wordCharacter.length; i++) {
			dequeue.addFront(wordCharacter[i]);
		}
		String string="";
		for (int i = 0; i < wordCharacter.length; i++) {
			MyNode<Character> character=dequeue.removeFront();//another way by casting
			string=string+character.getData();

		}
		if(string.equals(word)) 
			return true;
		else

			return false;
	}

	/*
	 * prime 2D Array
	 */
	public static void prime2DArray()
	{
		int array[][]=new int[10][100];
		int prime[][]=new int[10][100];
		int temp=1;
		for (int i = 0; i< 10; i++) {
			for (int j = 0; j < 100; j++) {
				array[i][j]=temp;
				temp++;
			}
		}
		for (int i = 0; i <10; i++) {
			for (int j = 0; j < 100; j++) {
				if(checkPrime(array[i][j]))
				{
				prime[i][j]=array[i][j];
				}
				else
				{
					prime[i][j]=-1;
				}
			}
		}
		for (int i = 0; i < 10; i++) {
			for (int j = 1; j < 100; j++) {
				if(prime[i][j]!=-1)
				{
					System.out.print(prime[i][j]+" ");
				}
			}
			System.out.println("\n");
		}
	}
	
	/*
	 * Check prime
	 */
	public static boolean checkPrime(int number)
	{
		int count=0;
		for (int i = 2; i <=number/2; i++) {
			if(number%i==0)
			{
				count++; 
				break;
			}
		}
		if(count==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
//	
//	/*
//	 * Hashing Function
//	 */
//	public static void hashingFunction() throws IOException
//	{
//		File file=new File("/home/admin1/HashingFunction");
//		BufferedReader br=new BufferedReader(new FileReader(file));
//		int totalSlot=0;
//		LinkedList<Integer>[] list=new LinkedList[totalSlot];
//		for (int i = 0; i <=totalSlot; i++) {
//			list[j]=new List();
//			
//		}
//		
//	}
	
	/*
	 * Number of Binary Search Tree
	 */
	public static double numberOfBinarySearchTree(double totalNodes)
	{
		double numerator=factorial1(2*totalNodes);
		double demoninator=(factorial1(totalNodes+1))*(factorial1(totalNodes));
		double differentTree=numerator/demoninator;
		return differentTree;
	}
	
	/*
	 * Calculating the factorial of the given number
	 * 
	 * @param i
	 * @return factorial of the given number
	 */
	public static double factorial1(double i)
	{
		double fact=1;
		while(i>0)
		{
			fact=fact*i;
			i--;
		}
		return fact;
	}
	
	/*
	 * Prime Anagram 2D Array
	 */
	public static void primeAnagram2DArray(int[] prime)
	{
		for (int i = 0; i < prime.length; i++) {
			System.out.println(i);
		}
	}
	
	public static String[] prime(int range) {
		String[] array = new String[1000];
		int position = 0;
		for(int i = 2; i <= range; i++) {
			boolean isPrime = true;
			for(int j = 2; j <= i / 2; j++) {
				if((i % j) == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				array[position] = String.valueOf(i);
				position++;
			}
		}
		String[] returnArray = new String[position];
		for(int k = 0; k < position; k++) {
			returnArray[k] = array[k];
		}
		return returnArray;
	}
	

	/*
	 * primeAnagramLinkedListQueue
	 */
		public static boolean anagram(String stringOne, String stringTwo) {
			if(stringOne.length() != stringTwo.length()) {
				return false;
			}
			char[] arrayOne = stringOne.toCharArray();
			Arrays.sort(arrayOne);
			char[] arrayTwo = stringTwo.toCharArray();
			Arrays.sort(arrayTwo);
					
			for(int i = 0; i < arrayOne.length; i++) {
				if(arrayOne[i] != arrayTwo[i]) {
					return false;
				}
			}
			return true;
		}

	/*
	 * Calender Program
	 */
	
		public static void calender(int month,int year)
		{

		int year1; 
		int month1, x, day = 1, day1;
		year1 = year - (14 - month) / 12;
		x = year1 + (year1 / 4) - (year1 / 100) + (year1 / 400);
		month1 = month + 12 * ((14 - month) / 12) - 2;
		day1 = (day + x + (31 * month1) / 12) % 7;
		String[] monthName = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		int[] monthDays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int monthDay = 0;
		for (int i = 0; i < monthDays.length; i++) {
			if (i == month - 1) {
				monthDay = monthDays[i];
			}
		}
		int[][] totalDays = new int[6][7];
		boolean leap = leapYear(year);
		if (leap && month == 1) {
			monthDay = 29;
		}
		int z = 1;
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				if (i == 0 && j < day1) {
					totalDays[i][j] = -1;
				} else if (z <= monthDay) {
					totalDays[i][j] = z;
					z++;
				} else {
					totalDays[i][j] = -1;
				}
			}
		}
		for (int i = 0; i < 12; i++) {
			if (month == i + 1) {
				System.out.print(monthName[i] + " " + year);
			}
		}
		System.out.println();
		String[] dayName = { "S", "M", "T", "W", "T", "F", "S" };
		for (int i = 0; i < 7; i++) {
			System.out.print(dayName[i] + "  ");
		}
		System.out.println();
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				if (totalDays[i][j] != -1) {
					if (totalDays[i][j] < 10)
						System.out.print(totalDays[i][j] + "  ");
					else
						System.out.print(totalDays[i][j] + " ");
				} else
					System.out.print("   ");
			}
			System.out.println();
		}
	}
	
	/*
	 * Finding if a year is Leap Year or not
	 * 
	 * @param year
	 * @return true if year is leap and false if year is not leap year
	 */
	public static boolean leapYear(int year) {
		if (year % 100 != 0 && year % 4 == 0) {
			return true;
		} else if (year % 100 == 0 && year % 400 == 0) {
			return true;
		} else {
			return false;
		}
	}
}



























