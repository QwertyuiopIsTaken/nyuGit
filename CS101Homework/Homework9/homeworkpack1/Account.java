package homeworkpack1;

import java.util.Date;

// Class file
public class Account {
	// Instance Variables
	private int id;
	private double balance;
	private static double annualInterestRate = 0; // same for all accounts
	
	private Date dateCreated;
	
	// Constructors
	Account() {
		id = 0;
		balance = 0;
		dateCreated = new Date();
	}
	
	Account(int _id, double _balance) {
		id = _id;
		balance = _balance;
		dateCreated = new Date();
	}
	
	// Accessors
	public int getId() {
		return id;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public static double getAnnualInterestRate() { // same for all accounts
		return annualInterestRate;
	}
	
	public Date getDateCreated() {
		return dateCreated;
	}
	
	// Mutators
	public void changeId(int newId) {
		id = newId;
	}
	
	public void changeBalance(double newBalance) {
		balance = newBalance;
	}
	
	public static void changeAnnualInterestRate(double newAnnualInterestRate) { // same for all accounts
		annualInterestRate = newAnnualInterestRate;
	}
	
	// Methods
	public static double getMonthlyInterestRate() { // same for all accounts
		return annualInterestRate / 12;
	}
	
	public double getMonthlyInterest() {
		return getMonthlyInterestRate() * balance; 
	}
	
	public void withdraw(double amount) {
		balance -= amount;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
}