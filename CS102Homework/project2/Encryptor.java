package project2;

/**
 * The Encryptor class is used to encrypt a string using a specific card algorithm.
 * 
 * It retrieves encryption key values based on a deck of cards from the CardDeck class, which updates
 * continuously from where the last encryption is left off.
 * 
 * The class methods are used to encode a given string using a generated key value.
 * 
 * @author: Ricky Jian
 */

public class Encryptor {
	// Instance variables for the card configuration
    private CardDeck deck;
    
    /**
     * Constructor for an Encryptor instance with a given card configuration
     * 
     * @param deck The card configuration being used
     */
    public Encryptor(CardDeck deck) {
        this.deck = deck;
    }

    /**
     * Encrypts a given string using a card cipher system
     * 
     * Each character in the input string is shifted forward based on generated key values
     * The card deck updates after every encryption
     * 
     * If the character goes beyond 'Z', it circles around to the first letter of the alphabet
     * 
     * @param s The string to encrypt
     * @return The encrypted text
     */
    public String encrypt(String s) {
    	if (s == null || s.length() <= 0) {
    		return s;
    	}
    	
    	StringBuilder secret = new StringBuilder();
    	
    	for (int i = 0; i < s.length(); i++) {
    		char initialChar = s.charAt(i);
    		int keyValue = deck.nextKeyValue();
    		char finalChar = (char)(initialChar + keyValue);
    		
    		if (finalChar > 'Z') {
    			finalChar = (char)(((finalChar - 'Z') % 26) + 'A' - 1);
    		}
    		
    		secret.append(finalChar);
    	}
    	
        return secret.toString();
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