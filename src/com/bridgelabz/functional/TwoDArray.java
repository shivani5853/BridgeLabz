package com.bridgelabz.functional;

import java.util.Scanner;
import utility.FunctionalUtility;
import java.io.PrintWriter;

public class TwoDArray {
	/*
	 * Integer method
	 */
	static int[][] arryaint(int m, int n) {
		int a[][] = new int[m][n];
		System.out.println("enter the values");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = FunctionalUtility.inputInteger();
			}
		}
		return a;
	}

	/*
	 * Double method
	 */
	static double[][] arrayDouble(int m, int n) {
		Scanner sc = new Scanner(System.in);
		double b[][] = new double[m][n];

		System.out.println("enter the values");

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				b[i][j] = sc.nextDouble();
			}
		}
		return b;
	}

	/*
	 * Boolean method
	 */
	static String[][] arrayBoolean(int m, int n) {
		Scanner sc = new Scanner(System.in);
		String c[][] = new String[m][n];

		System.out.println("enter the value");

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				c[i][j] = sc.next();
			}
		}
		return c;
	}

	/*
	 * Display method
	 */
	public static void display(int[][] a, double[][] b, String[][] c, int m, int n) {
		PrintWriter pw = new PrintWriter(System.out, true);
		System.out.println("2D array integer");
		System.out.println();
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("\t" + a[i][j] + " ");
			}
			System.out.println("\t");
		}
		System.out.println();
		pw.println("2D array double");
		System.out.println();

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				pw.print("\t" + b[i][j] + " ");
			}
			pw.println("\t");
		}
		System.out.println();
		pw.println("2D array string");
		System.out.println();

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				pw.print("\t" + c[i][j] + " ");
			}
			pw.println("\t");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the m(row) value");
		int m = sc.nextInt();
		System.out.println("enter the n(column) value");
		int n = sc.nextInt();

		int[][] a = arryaint(m, n);
		double[][] b = arrayDouble(m, n);
		String[][] c = arrayBoolean(m, n);
		display(a, b, c, m, n);
		sc.close();
	}

}