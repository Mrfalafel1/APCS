import java.io.*;
import java.util.*;

class Main
{
	private ArrayList<Card> hand1;
	private ArrayList<Card> hand2;

	private int hand1value;
	private int hand2value;

	public static void Main(){
		shuffleDeck();
		dealHands();
	}

	public static void dealHands(){
		for (int i=0; i<5; i++) {
			hand1.add(Deck.getTopCard());
			hand2.add(Deck.getTopCard());
		}
	}
	public static void calculateHandValue(){
		for (Card c: hand1) {
			hand1value=hand1value+c.pointValue;
		}
		for (Card c: hand2) {
			hand2value=hand2value+c.pointValue;
		}
	}
	public static void score(){
		if (hand1value>hand2value) {
			System.out.println("Hand 1 wins");
		}
		else{
			System.out.println("Hand 2 wins");
		}
	}
}