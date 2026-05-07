package com.pluralsight;

public class CardApp {

    public static void main(String[] args) {

        //we need a deck
        Deck deck = new Deck();

        //shuffle all the cards
        deck.shuffle();

        Hand hand1 = new Hand();

        for (int i = 0; i < 5; i++){

            //getting a card out of the deck
            Card card = deck.deal();

            //giving that card to the hand
            hand1.deal(card);

        }

        //print out the value of all the cards in the hand
        System.out.println("This hand is worth " + hand1.getValue());

    }

}
