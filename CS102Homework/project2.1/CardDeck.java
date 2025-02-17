package project2;

import java.util.ArrayList;

/**
 * The CardDeck class should be used to store and manipulate the card deck used for the encryption
 * author: Ricky Jian
 */

public class CardDeck extends ArrayList<Integer>{
	// Instance variables for the card configuration
    int[] deck;
    
    /**
     * Constructor that creates a CardDeck object based on a card configuration
     * @param initialDeck used
     */
    public CardDeck(int[] initialDeck) {
        // TODO: Implement this constructor.
    }

    /**
     * Returns the next key value.
     * @return An integer of the next key value.
     */
    public int nextKeyValue() {
        // TODO: Implement this method.
        return 0;
    }
    
    /**
     * Returns all values corresponding to the deck
     * @return An integer array with all the values in the deck.
     */
    public int [] getDeckValues() {
    	// TODO: Implement this method.
    	return null;
    }
    
    /**
     * Returns a string representation of the point in the format (x, y).
     * @return A string representation of the point.
     */
    @Override
    public String toString() {
    	// TODO: returns a string in the format of the values enclosed in square brackets separated by commas
    	return "";
    }
}