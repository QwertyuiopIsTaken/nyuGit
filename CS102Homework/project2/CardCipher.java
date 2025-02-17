package project2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * The CardCipher class is the main driver file that will be used for encryption and decryption
 * 
 * This class reads an input file provided as a command line argument and extracts the card
 * configuration from the first line of the file, then the second line tells the
 * program whether to encrypt or decrypt the message, while the rest of the file
 * contains the actual message.
 * 
 * This class is meant to only handle file reading and processing, while the actual encryption 
 * and decryption are done by the Encryptor and Decryptor classes
 * 
 * @author: Ricky Jian
 */

public class CardCipher {
	/**
     * Reads the input file and either encrypts or decrypts the message in the file.
     * If there is a problem with the file, such as a file name that does not exist,
     * it will print out a system error message.
     * 
     * @param args Command line arguments, which should be the input file name
     */
    
	public static void main(String[] args) {
		// make sure there is an argument passed into the main method
		if (args.length == 0) {
            System.err.println("Error: the program expects file name as an argument.");
            System.exit(1);
        }

		File cardInputFile = new File(args[0]);
        // verify that command line argument contains a name of an existing file
        if (!cardInputFile.exists()) {
            System.err.println("Error: the file " + cardInputFile.getAbsolutePath() + " does not exist.");
            System.exit(1);
        }

        Scanner cardInput = null;
        // verify that the file can be read
        try {
        	// open the file for reading
        	cardInput = new Scanner(cardInputFile) ;
        } catch (FileNotFoundException e) {
            System.err.println("Error: the file " + cardInputFile.getAbsolutePath() + " cannot be opened for reading.");
            System.exit(1);
        }
        
        // initialize variables
        String line = null;
        int count = 0;
        
        int[] cardConfig = new int[28];
        boolean encryptMessage = true; // true means encrypt, false means decrypt
        ArrayList<String> message = new ArrayList<>();
        
        // read the file
        while (cardInput.hasNextLine()) {
        	line = cardInput.nextLine().trim();
        	if (count == 0) {
        		String[] nums = line.split(" ");
        		for (int i = 0; i < cardConfig.length; i++) {
        			cardConfig[i] = Integer.parseInt(nums[i]);
        		}
        		count++;
        	} else if (count == 1) {
        		encryptMessage = (line.toString().equalsIgnoreCase("encrypt"));
        		count++;
        	} else {
        		// we can assume that the message begins on the third line
        		message.add(line);
        	}
        }
        
        // create card deck
        CardDeck deck1 = new CardDeck(cardConfig);
        
        for (int i = 0; i < message.size(); i++) {
	        if (encryptMessage) {
	        	Encryptor obscure = new Encryptor(deck1);
	        	System.out.println(obscure.encrypt(message.get(i)));
	        } else {
	        	Decryptor reveal = new Decryptor(deck1);
	        	System.out.println(reveal.decrypt(message.get(i)));
	        }
        }
	}
	
	
}