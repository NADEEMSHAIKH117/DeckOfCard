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

	public static void main(String[] args) {
		DeckOfCard deckOfCard = new DeckOfCard();
		deckOfCard.gameSetUp();
		deckOfCard.addPlayer(2);
	}

	/**
	 * initializing the deck of card
	 */
	private void gameSetUp() {
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
	private void addPlayer(int numberOfPlayers) {
		if (numberOfPlayers >= 4) {
			System.out.println("Maximum of 4 players is allowed");
		} else {
			Scanner sc = new Scanner(System.in);
			for (int i = 0; i < numberOfPlayers; i++) {
				System.out.println("Enter first name");
				String fn = sc.nextLine();
				System.out.println("Enter second name");
				String ln = sc.nextLine();
				Player player = new Player(ln, fn);
				player.setFirstname(fn);
				player.setLastName(ln);
				playerList.add(player);
				for (int j = 0; j < playerList.size(); j++) {
					System.out.println(playerList.get(j));
				}
			}
			sc.close();
		}
	}

	/**
	 * printing the deck of card
	 */
	private void printDeck() {
		for (int i = 0; i < deck.length; i++) {
			System.out.println(deck[i]);
		}
	}
}
	

