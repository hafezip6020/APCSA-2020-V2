package elevensLab;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//make a Deck class
public class Deck {

	public static final int NUMCARDS = 52;
	public static String[] SUITS = "CLUBS HEARTS DIAMONDS SPADES".split(" ");
	
	private List<Card> cards;
	private int top;
	Card one = new Card();

   //make a Deck constructor
	
	public Deck()
	{
		cards = new ArrayList<Card>();
		top = 51;
		String suit = "HEARTS";
	   	for(int i = 0; i<4; i++) {
	   		suit = SUITS[i];
	   		for(int j = 1; j<14; j++) {
	   			cards.add(new Card(suit,j));
	   		}
	   		}
	   	
	}
	
   	//refer cards to new ArrayList
   	//set top to the top of the deck 51

   	//loop through all suits
   		//loop through all faces 1 to 13
   			//add a new TwentyOneCard to the deck

   
   //make a dealCard() method that returns the top card
	
	public Deck(String[] ranks, String[] suits, int[] values) {
		cards = new ArrayList<Card>();
		for (int i = 0 ; i < suits.length; i++) {
			for (int j = 0 ; j < ranks.length; j++) {
				cards.add(new Card(ranks[j],suits[i], values[j]));
			}
			
		}
		top = cards.size()-1;
	}
	
   public Card dealCard() {
	   top = top -1;
	   return cards.get(top+1);
   }
   
   public Card deal() {
	  
	   Card tmp = cards.get(top);
	   cards.remove(top);
	   top = top -1;
	   if (top == -1) {
		   
	   }
	   
	   return tmp;
   }
   //write a shuffle() method
   public void shuffle() {
	   Collections.shuffle(cards);
	   top = cards.size();
   }
   	//use Colletions.shuffle
   	//reset the top card
   public boolean isEmpty() {
	   if (cards.size()==0) {
		   return true;
	   }
	   return false;
	   
   }
	   
	public int size() {
		return cards.size();
	}
	public String toString() {
		return "This deck has " + cards.size() + " cards.";
	}
}