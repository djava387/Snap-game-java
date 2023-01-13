package org.example;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.TimerTask;
import java.util.Timer;


public class Snap extends CardGame {
    private final CardGame cardGame;
    private final Player player;
    private final Player opponent;
    private String lastCardSymbol;

    public Snap(String name) {
        super(name);
        this.cardGame = new CardGame(name);
        this.player = new Player();
        this.opponent = new Player();
        this.lastCardSymbol = "";
    }

    public void startGame() {
        System.out.println("Welcome to Snap! Let's start the game.");

        System.out.println("\nOriginal deck of cards: ");
        printDeck(cardGame.getDeck());

        System.out.println("\nDealing a card: " + cardGame.dealCard());

        System.out.println("\nDeck of cards after dealing a card: ");
        printDeck(cardGame.getDeck());

        System.out.println("\nSorting deck of cards in number order: ");
        printDeck(cardGame.sortDeckInNumberOrder());

        System.out.println("\nSorting deck of cards into suits: ");
        printDeck(cardGame.sortDeckIntoSuits());

        System.out.println("\nShuffling the deck of cards: ");
        printDeck(cardGame.shuffleDeck());

        System.out.println("Shuffling the deck...again");
        cardGame.shuffleDeck();
        System.out.println("Deck shuffled. Let's begin 😎😎😎");
    }

    public void playerTurn() {
        System.out.println("Your turn! Press enter to draw a card.");
        // Wait for user to press enter
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        try {
            Card card = cardGame.dealCard();
            player.drawCard(card);
            System.out.println("You drew: " + card);
            checkForSnap(card.getSymbol(), true);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("The deck is empty, the game is over.");
            endGame();
        }
    }

    public void opponentTurn() {
        System.out.println("Opponent's turn!");
        try {
            Card card = cardGame.dealCard();
            opponent.drawCard(card);
            System.out.println("Opponent drew: " + card);
            checkForSnap(card.getSymbol(), false);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("The deck is empty, the game is over.");
            endGame();
        }
    }

    public void checkForSnap(String symbol, boolean isPlayerTurn) {
        if (lastCardSymbol.equals(symbol)) {
            System.out.println("SNAP opportunity! You have 5 seconds to type 'snap' and win.");
            Timer timer = new Timer();
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    System.out.println("Time's up! Someone lost.");
                    endGame();
                }
            }, 5000);

            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("snap")) {
                timer.cancel();
                if (isPlayerTurn) {
                    System.out.println("SNAP! You win! 🎉 🎉 🎉 🎉 🎉 🎉 🎉 🎉 🎉 🎉 🎉 🎉 🎉 🎉 🎉 🎉 🎉");
                } else {
                    System.out.println("SNAP! Opponent wins!");
                }
                endGame();
            } else {
                timer.cancel();
                System.out.println("Incorrect input, you lost.");
                endGame();
            }
        } else {
            lastCardSymbol = symbol;
        }
    }




    public void endGame() {
        System.out.println("Thanks for playing Snap! Your final hand was: " + player.getHand());
        System.out.println("Opponent's final hand was: " + opponent.getHand());
        System.exit(0);
    }

    public static void printDeck(ArrayList<Card> deck) {
        for (Card card : deck) {
            System.out.println(card);
        }
    }
}
