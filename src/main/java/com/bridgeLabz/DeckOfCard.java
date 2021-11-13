package com.bridgeLabz;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class DeckOfCard {
	private static String[] suit = { "Spades", "Hearts", "Diamond", "Clubs" };
	private static String[] rank = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
	private static String[][] deckOfCards = { suit, rank };
	private static Card[] deck = new Card[52];
	private static List<Player> playerList = new ArrayList<Player>();
	private static Scanner sc = new Scanner(System.in);

	/**
	 * initializing the deck of card
	 */
	public void gameSetUp() {
		int i = 0;
		for (String s : deckOfCards[0]) {
			for (String value : deckOfCards[1]) {
				deck[i++] = new Card(s, value);
			}
		}
	}

	/**
	 * adding players to the game
	 */
	public void addPlayer(int numberOfPlayers) {
		if (numberOfPlayers >= 4) {
			System.out.println("Maximum of 4 players is allowed");
		} else {
			for (int i = 0; i < numberOfPlayers; i++) {
				System.out.println("Enter first name");
				String fn = sc.nextLine();
				System.out.println("Enter second name");
				String ln = sc.nextLine();
				Player player = new Player(fn, ln);
				playerList.add(player);
				for (int j = 0; j < playerList.size(); j++) {
					System.out.println(playerList.get(j));
				}
			}
		}
	}

	/**
	 * printing the deck of card
	 */
	public void printDeck() {
		for (int i = 0; i < deck.length; i++) {
			System.out.println(deck[i]);
		}
	}

	/**
	 * To sequence the Players order and how they should receive the cards and
	 * further order for play
	 */
	public void orderPlayerTurn(int numberOfPlayers) {
		System.out.println("Enter players order");
		for (int i = 0; i < numberOfPlayers; i++) {
			int turn = sc.nextInt();
			playerList.get(i).setPlayerTurn(turn);
		}
	}
}
	

