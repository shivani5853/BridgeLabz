/******************************************************************************

 *  Purpose: Functional Utility class
 *
 *  @author  BridgeLabz
 *  @version 1.0
 *  @since   26-10-2019
 *
 ******************************************************************************/

/*
 * PACKAGE NAME
 */
package utility;

/*
 * IMPORT STATEMENT
 */
import java.util.Random;
import java.util.Scanner;

public class FunctionalUtility 
{
	static Scanner scanner;//Taken Scanner as static 
	static Random random;	//Taken Random as static

	/*
	 * constructor 
	 */
	public FunctionalUtility() {
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
	/* leap year */
	public static int checkDigit(int year)
	{
		int count=0;
		while(year!=0)
		{
			count++;
			year=year/10;
		}
		return count;
	}
	public static boolean leapYear(int year)
	{
		
//		if(year%4==0 && !(year%100==0) && year%400==0)
//			return true;
//		
//		return false;

		
		if(year%4==0 )
		{
			if(year%100==0)
			{
				if(year%400==0)
					return true;
				else
					return false;
			}
			else
				return true;
		}
		else
			return false;
	}
	
	/*Sum of the three number is zero*/
	public static void sumZero(int ar[],int size)
	{
		for (int i = 0; i < size-2; i++){
			for (int j = i+1; j <size-1 ; j++){
			for (int j2 = i; j2 <size; j2++){
				if(ar[i]+ar[j]+ar[j2]==0){
					System.out.println("The three number sum is zero"+ar[i]+" "+ar[j]+" "+ar[j2]);
					}
				}
			}
		}
	}
	
	/*String permutation*/
	public static void permutation(String str,int i,int j)
	{
		if(i==j)
		{
			System.out.println(str);
		}
		else
		{
			for (int k = i; k <=j; k++)
			{
				str=swap(str,i,k);
				permutation(str, i+1, j);
			}
		}
	}
	public static String swap(String str,int i,int j)
	{
		char temp;
		char ch[]=str.toCharArray();
		temp=ch[i];
		ch[i]=ch[j];
		ch[j]=temp;
		return String.valueOf(ch);
	}
	
	/*Check harmonic number*/
	public static void harmonicNumber(int num)
	{
	float harmonic=1;
	if(num!=0)
	{
	for (int i = 2; i <=harmonic; i++)
	{
	harmonic=harmonic+(float)1/i;	
	}
	System.out.println("sum of nth harmonic no is"+harmonic);
	}
	}
	
	/*Prime Factors*/
	public static void primeFactors(int num)
	{
		while(num%2==0)
		{
			System.out.println(2+" ");
			num=num/2;
		}
		for (int i = 3; i<=Math.sqrt(num); i++) {
			while(num%i==0)
			{
				System.out.println(i+" ");
				num/=i;
			}
		}
			if(num>2) 
			{
				System.out.println(num);
			}
	}
	
	/*Power of Two*/
	public static void powerOfTwo(int num)
	{
		if(num>=0&&num<=31)
		{
			for (int i = 0; i <=num; i++) {
			double result=Math.pow(2,i);
			System.out.println("2*"+i+"="+result);
			}
		}
	}
	
	/*Scanner value*/
	public static Object scanner()
	{
		Scanner scanner=new Scanner(System.in);
		return scanner;
	}
	
	/*Flip coin*/
	public static boolean flipCoin()
	{
		
		if(Math.random()<=0.5)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	/*Distance calculation*/
	public static double distance(int pointx,int pointy)
	{
		int pointx1=0,pointy1=0;
		double cal=(Math.sqrt(Math.pow((pointx-pointx1),2)+Math.pow((pointy-pointy1),2)));
		return cal;
	}
	
	/*Gambler Program*/
	public static void gambler(int trails,int goal,int stake)
	{
		int bets=0;
		int win=0;
		int loss=0;
		for (int i = 0; i < trails; i++) 
		{
			int cash=stake;
			while(cash>0&&cash<goal)
			{
				bets++;
				System.out.println(bets);
			if(Math.random()>0.5)
			{
				cash++;
			}
			else
			{
				cash--;
			}
			}
			if(cash==goal)
			win++;
			else
			loss++;
		}
		System.out.println(bets);
		System.out.println(win+" win of "+trails);
		System.out.println("Percentage of game win is "+100*win/trails);
		System.out.println("bets "+1.0*bets/trails);
		System.out.println(loss);
	}
	
	/*Coupon Number*/
	public static int getCoupon(int n)
	{
		return (int)(Math.random()*n);
	}
	public static int collect(int n)
	{
		boolean[] isCollected=new boolean[n];
		int count=0;
		int distint=0;
		
		while(distint<n)
		{
			int value=getCoupon(n);
			count++;
			if(!isCollected[value])
			{ 
				distint++;
				System.out.println(distint);
				isCollected[value]=true;
			}
		}
		return count;
	}
	
	/* Quadratic */
	public static void rootOfX(double a,double b,double c)
	{
		double root1=0.0,root2=0.0;
		double delta=(Math.pow(b,2)-4*a*c);
		if(delta>0)
		{
		root1=(-b+Math.sqrt(delta))/(2*a);
		root2=(-b-Math.sqrt(delta))/(2*a);
		System.out.format("root1= %.2f root2= %.2f"+root1+" "+root2);
		}
		else if(delta==0)
		{
			root1=root2=-b/(2*a);
			System.out.format("root1= %.2f root2= %.2f"+root1+" "+root2);
		}
		else
		{
			double realPart=-b/(2*a);
			double imaginaryPart=Math.sqrt(-delta)/(2*a);
			System.out.format("root1= %.2f+%.2fi root2= %.2f-%.2fi",realPart,imaginaryPart,realPart,imaginaryPart);
		}
	}
}




















