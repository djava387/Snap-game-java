# Snap Game

Snap is a card game where players take turns to draw cards from a deck, and the first player to call "snap" when two consecutive cards have the same symbol wins the game.

### How to run
* In the Main class located in package org.example, run the main method in your prefered Java IDE.
* The game will start and players will take turns to draw cards from the deck.
* If two consecutive cards have the same symbol, the game will print a message to the console that a "SNAP" opportunity is available, and the user has 5 seconds to type "snap" to win.
* If the user types "snap" within 5 seconds, they win the game, otherwise, the opponent wins.
## Classes
### Main
This class is responsible for running the game. It creates an instance of the Snap class and calls the startGame and playerTurn and opponentTurn methods in a loop.

### Card
This class represents a card in the deck. It has three properties: suit, symbol, and value. It also has getter methods for each property and a toString method that returns the card's symbol and suit in a human-readable format.

### CardGame
This class represents the game and contains the logic for dealing cards, sorting the deck, and shuffling the deck. It contains the properties of the name of the game, an ArrayList of cards representing the deck, and methods for dealing a card, sorting the deck in number order, sorting the deck into suits, and shuffling the deck.

### Snap
This class represents the Snap game, it is the child class of CardGame, it contains the properties of the game, a player, an opponent, and the last card symbol. It also contains the checkForSnap method that checks if the last card symbol equals the current card symbol, if true, it will print a message to the console that a "SNAP" opportunity is available and the user has 5 seconds to type "snap" to win.