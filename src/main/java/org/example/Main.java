package org.example;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Snap snap = new Snap("Snap");
        snap.startGame();
        while (true) {
            snap.playerTurn();
            snap.opponentTurn();
        }

//        CardGame game = new CardGame("Blackjack");
//
//
//        System.out.println("Name of the game: " + game.getName());
//        System.out.println("\nOriginal deck of cards: ");
//        printDeck(game.getDeck());
//
//        System.out.println("\nDealing a card: " + game.dealCard());
//
//        System.out.println("\nDeck of cards after dealing a card: ");
//        printDeck(game.getDeck());
//
//        System.out.println("\nSorting deck of cards in number order: ");
//        printDeck(game.sortDeckInNumberOrder());
//
//        System.out.println("\nSorting deck of cards into suits: ");
//        printDeck(game.sortDeckIntoSuits());
//
//        System.out.println("\nShuffling the deck of cards: ");
//        printDeck(game.shuffleDeck());
//    }
//
//    public static void printDeck(ArrayList<Card> deck) {
//        for (Card card : deck) {
//            System.out.println(card);
//        }
    }
}






