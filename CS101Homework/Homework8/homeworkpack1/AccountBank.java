/*
Ricky Jian, 10/26/24
Program 8.1
The purpose of this program is to use the Account class
*/

package homeworkpack1;

// Main file
public class AccountBank {
	public static void main(String[] args) {
		// Declaration
		Account bank;
		
		// Processing
		bank = new Account(1122, 20000); // use the overloaded constructor
		Account.changeAnnualInterestRate(4.5/100);
		System.out.println("You withdrew $2,500");
		bank.withdraw(2500);
		System.out.println("You deposited $3,000");
		bank.deposit(3000);
		
		// Output
		System.out.println("Here is your balance: " + bank.getBalance());
		System.out.println("Here is your monthly interest: " + bank.getMonthlyInterest());
		System.out.println("Here is the date your account was created: " + bank.getDateCreated());
	}
}