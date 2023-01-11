package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CardGame {
    private String name;
    private ArrayList<Card> deckOfCards;
    
    public CardGame(String name) {
        this.name = name;
        this.deckOfCards = new ArrayList<Card>();
        String[] suits = {"\u2665", "\u2666", "\u2663", "\u2660"};
        String[] symbols = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        int[] values = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
        for (String suit : suits) {
            for (int i = 0; i < symbols.length; i++) {
                Card card = new Card(suit, symbols[i], values[i]);
                deckOfCards.add(card);
            }
        }
    }
    
    public String getName() {
        return name;
    }
    
    public ArrayList<Card> getDeck() {
        return deckOfCards;
    }
    
    public Card dealCard() {
        return deckOfCards.remove(0);
    }
    
    public ArrayList<Card> sortDeckInNumberOrder() {
        Collections.sort(deckOfCards, new Comparator<Card>() {
            @Override
            public int compare(Card card1, Card card2) {
                return card1.getValue() - card2.getValue();
            }
        });
        return deckOfCards;
    }
    
    public ArrayList<Card> sortDeckIntoSuits() {
        Collections.sort(deckOfCards, new Comparator<Card>() {
            @Override
            public int compare(Card card1, Card card2) {
                if (!card1.getSuit().equals(card2.getSuit())) {
                    return card1.getSuit().compareTo(card2.getSuit());
                } else {
                    return card1.getValue() - card2.getValue();
                }
            }
        });
        return deckOfCards;
    }
    
        public ArrayList<Card> shuffleDeck() {
        Collections.shuffle(deckOfCards);
        return deckOfCards;
    }
}