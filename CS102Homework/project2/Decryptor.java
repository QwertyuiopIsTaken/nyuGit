package project2;

/**
 * The Decryptor class is used to decrypt a string using a specific card algorithm.
 * 
 * The deck is updated after each decryption starting with an initial deck configuration.
 * 
 * @author: Ricky Jian
 */

public class Decryptor {
	// Instance variables for the card configuration
    CardDeck deck;
    
    /**
     * Constructs a Decryptor instance based on a given deck.
     * 
     * @param deck The initial card configuration
     */
    public Decryptor(CardDeck deck) {
    	this.deck = deck;
    }

    /**
     * Decrypts a given string using a card cipher system
     * 
     * Each character in the input string is shifted back based on generated key values
     * The card deck updates after every decryption
     * 
     * If the character goes before 'A', it circles around to the last letter of the alphabet
     * 
     * @param s The encrypted string to decrypt
     * @return The decrypted message
     */
    public String decrypt(String s) {
    	if (s == null || s.length() <= 0) {
    		return s;
    	}
    	
    	StringBuilder answer = new StringBuilder();
    	
    	for (int i = 0; i < s.length(); i++) {
    		char initialChar = s.charAt(i);
    		int keyValue = deck.nextKeyValue();
    		char finalChar = (char)(initialChar - keyValue);
    		
    		if (finalChar < 'A') {
    			finalChar = (char)('Z' - (('A' - finalChar) % 26) + 1);
    		}
    		
    		answer.append(finalChar);
    	}
    	
        return answer.toString();
    }
    
    /**
     * Returns the card deck, which is continuously modified.
     * 
     * @return The current card deck
     */
    public CardDeck getDeck() {
    	return deck;
    }
}