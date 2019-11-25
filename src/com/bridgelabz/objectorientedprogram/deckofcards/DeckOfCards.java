/******************************************************************************

 *  Purpose: Write a Program DeckOfCards.java , to initialize deck of cards having suit ("Clubs",
			"Diamonds", "Hearts", "Spades") & Rank ("2", "3", "4", "5", "6", "7", "8", "9", "10",
			"Jack", "Queen", "King", "Ace"). Shuffle the cards using Random method and then
			distribute 9 Cards to 4 Players and Print the Cards the received by the 4 Players
			using 2D Array...
			
 *  @author  Shivani Kumari
 *  @version 1.0
 *  @since   22-11-2019
 *
 ******************************************************************************/

/*
 * PACKAGE NAME
 */
package com.bridgelabz.objectorientedprogram.deckofcards;

/*
 * IMPORT STATEMENT
 */
import java.util.Random;

public class DeckOfCards {

	/*
	 * Method to find card Distribution
	 */
	public static String[][] cardDistribute() {
		String arr[][] = new String[4][13];
		cardInsert(arr);
		cardShuffle(arr);

		String playercard[][] = new String[4][9];
		for (int i = 0; i < playercard.length; i++) {
			for (int j = 0; j < playercard[i].length; j++) {
				playercard[i][j] = arr[i][j];
			}
		}
		return playercard;
	}

	/*
	 * Method to card Insert
	 */
	public static void cardInsert(String arr[][]) {
		String Suits[] = { "Clubs", "Diamonds", "Hearts", "Spades" };
		String Rank[] = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "King", "Queen", "Ace" };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = Suits[i] + " " + Rank[j];
			}
		}
	}

	/*
	 * Method to swap
	 */
	public static void swap(String arr[][], int x1, int x2, int x3, int x4) {
		String temp = arr[x1][x2];
		arr[x1][x2] = arr[x3][x4];
		arr[x3][x4] = temp;
	}

	/*
	 * method to card Shuffle
	 */
	public static void cardShuffle(String arr[][]) {
		Random r1 = new Random();
		for (int i = 0; i < 150; i++) {
			int x1 = r1.nextInt(4);
			int x2 = r1.nextInt(13);
			int x3 = r1.nextInt(4);
			int x4 = r1.nextInt(13);
			swap(arr, x1, x2, x3, x4);

		}
	}

	public static void main(String[] args) {
		String playercard[][] = cardDistribute();

		System.out.println("Player 1\tPlayer 2\tPlayer 3\tPlayer 4");
		System.out.println();
		int x = 0;
		int y = 0;
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(playercard[x][y] + "       ");
				y++;
				if (y == 9) {
					y = 0;
					x++;
				}
			}
			System.out.println();
		}

	}

}
