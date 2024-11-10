/*
Ricky Jian, 11/7/24
Program 9.1
The purpose of this program is to create an ATM using Account class
*/

package homeworkpack1;

// Imports
import java.util.Scanner;

// Main file
public class ATM {
	public static void main(String[] args) {
		// Declaration
		Account[] accounts = new Account[10];
		Scanner numInput = new Scanner(System.in);
		
		for (int i = 0; i < 10; i++) {
			accounts[i] = new Account(i, 100); // use the overloaded constructor
		}
		
		System.out.print("Type in an id (1-9): ");
		int id = numInput.nextInt();
		boolean valid = false;
		if (id >= 0 && id <= 9) {
			valid = true;
		}
		while (!valid) {
			System.out.print("Try again. Type in a valid id: ");
			id = numInput.nextInt();
			if (id >= 0 && id <= 9) {
				valid = true;
			}
		}
		
		while (true) {
			showMenu();
			int option = numInput.nextInt();
			
			if (option == 1) { // balance
				System.out.println(accounts[id].getBalance());
			} else if (option == 2) { // withdraw
				System.out.println("How much do you want to withdraw?");
				accounts[id].withdraw(numInput.nextInt());
			} else if (option == 3) { // deposit
				System.out.println("How much do you want to deposit?");
				accounts[id].deposit(numInput.nextInt());
			} else { // exit
				System.out.print("Type in an id (1-9): ");
				id = numInput.nextInt();
			}
		}
	}
	
	public static void showMenu() {
		System.out.println("Menu:");
		System.out.println("1: Check balance");
		System.out.println("2: Withdraw");
		System.out.println("3: Deposit");
		System.out.println("4: Exit");
		System.out.print("Pick an option: ");
		
	}
}