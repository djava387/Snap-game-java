package org.example;

import java.util.ArrayList;

public class Player {
    private ArrayList<Card> hand;

    public Player() {
        this.hand = new ArrayList<Card>();
    }

    public void drawCard(Card card) {
        this.hand.add(card);
    }

    public ArrayList<Card> getHand() {
        return this.hand;
    }
}
