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
    }
}






