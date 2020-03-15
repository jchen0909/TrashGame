/**
 * 
 */
package edu.fiu.TrashGame;

import java.util.Random;

/**
 * @author simon
 * This is a deck class that have 52 cards
 */
public class Deck {
	private int deck; //representing the deck in stock

	
	public void shuffle() {
		
		/**
		 * create a shuffle method to random order 13 card and return the random number list
		 */
		
		
		Random rand = new Random(); 
		int rand_int = rand.nextInt(13); 
		 
		
		System.out.println("The Random number is: " +rand_int);
	  
	}
}
