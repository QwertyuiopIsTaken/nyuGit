package project2;

import java.util.ArrayList;

/**
 * The CardDeck class represents a deck of cards used for encryption and extends ArrayList<Integer>,
 * which can be used to transform the deck and generate encryption key values.
 * 
 * The deck follows an algorithm where two jokers (numbered 27 and 28) are moved, and a triple cut and
 * bottom card cut are performed to determine the key value.
 * 
 * @author: Ricky Jian
 */

public class CardDeck extends ArrayList<Integer>{
    /**
     * Constructor for a CardDeck instance from a given card configuration
     * 
     * @param initialDeck An integer array of the initial deck configuration
     */
    public CardDeck(int[] initialDeck) {
        for (int i = 0; i < initialDeck.length; i++) {
        	this.add(initialDeck[i]);
        }
    }

    /**
     * Generates a key value through a specific algorithm that consists of:
	     * Moving the joker card with a 27 value down 1 position
	     * Moving the joker card with a 28 value down 2 positions
	     * Swapping the section before the first joker and the section after the second joker
	     * Performing a bottom card cut while keeping the bottom card in place
	     * Determining the key value by looking at the card from the value of the first card
	     * Repeat the process if the first card is a joker card
     * 
     * @return An integer of the next key value
     */
    public int nextKeyValue() {
        // finds the position of joker card 1 shift it to the back of the list by one
    	int joker1 = this.indexOf(27);
    	moveVal(joker1, 1);
    	// finds the position of joker card 2 and shift it to the back of the list by two
    	int joker2 = this.indexOf(28);
    	moveVal(joker2, 2);
    	
    	// update joker indices and ensure that joker1 is the index to the first joker card
    	joker1 = this.indexOf(27);
    	joker2 = this.indexOf(28);
    	if (joker1 > joker2) {
    		int temp = joker1;
    		joker1 = joker2;
    		joker2 = temp;
    	}

    	// to swap the bottom and front parts:
    	// move the bottom part to the front
    	int amountShifted = moveGroup(joker2 + 1, this.size() - 1, 0);
    	// and move the front part to the back
    	moveGroup(amountShifted, joker1 + amountShifted - 1, this.size());
    	
    	// move the front part to the back while keeping the last card on the bottom
    	moveGroup(0, Math.min(26, (this.get(this.size() - 1) - 1)), this.size() - 1);
    	// take the first value and use that to find the value of the next card
    	int keyValue = this.get( this.get(0) % this.size() );
    	// repeat the process of the key if the card is a joker
    	if (keyValue == 27 || keyValue == 28) {
    		keyValue = nextKeyValue();
    	}
    	
        return keyValue;
    }
    
    /**
     * Returns the current deck configuration as an integer array
     * 
     * @return An integer array with all the values in the deck
     */
    public int[] getDeckValues() {
    	int[] deck = new int[this.size()];
    	for (int i = 0; i < deck.length; i++) {
    		deck[i] = this.get(i);
    	}
    	
    	return deck;
    }
    
    /**
     * Returns the current deck configuration
     * 
     * @param startingIndex Represents the first index of the group
     * @param endingIndex Represents the last index of the group
     * @param toPos represents the new index of the first index of the group
     * @return The amount shifted
     */
    private int moveGroup(int startingIndex, int endingIndex, int toPos) {
    	if (startingIndex > this.size()) {
    		return 0;
    	}
    	
        ArrayList<Integer> group = new ArrayList<>(this.subList(startingIndex, endingIndex + 1));
        // remove the elements from their original position
        for (int i = 0; i < group.size(); i++) {
            this.remove(startingIndex);
        }
        // insert the group to the new position with its first element being in toPos
        // necessary if the group needs to be shifted forward
        if (toPos > startingIndex) {
            toPos -= group.size();
        }
        
        this.addAll(toPos, group);
        return group.size();
    }
    
    /**
     * Shifts an element of an index by swapping with each element after it and returns the new index
     * 
     * @parm originalIndex Represents the original index of a given value
     * @parm shiftPos Represents the amount of positions that needs to be shifted (negative means shift to the left)
     * @return The index of a given value in an array after it finished shifting
     */
    private int moveVal(int originalIndex, int shiftPos) {
    	int current = originalIndex;
    	
    	if (shiftPos > 0) {
    		for (int i = 0; i < shiftPos; i++) {
    			int temp = this.get(current);
    			int newIndex = (current + 1) % this.size();
    			
    			this.set(current, this.get(newIndex));
    			this.set(newIndex, temp);
    			current = newIndex;
    		}
    		
    	} else {
    		shiftPos *= -1;
    		for (int i = 0; i < shiftPos; i++) {
    			int temp = this.get(current);
    			int newIndex = (current - 1 + this.size()) % this.size();
    			
    			this.set(current, this.get(newIndex));
    			this.set(newIndex, temp);
    			current = newIndex;
    		}
    	}
    	return current;
    }
    
    /**
     * Returns a list of values enclosed in square brackets with each separated by commas.
     * 
     * @return A string representation of the deck.
     */
    @Override
    public String toString() {
    	StringBuilder result = new StringBuilder();
    	result.append("[");
    	for (int i = 0; i < this.size() - 1; i++) {
    		// excludes the last index in the list
    		result.append(this.get(i) + ", ");
    	}
    	result.append(this.get(this.size() - 1) + "]");
    	
    	return result.toString();
    }
}