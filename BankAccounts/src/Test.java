/*Test Class
Jason Rimer
October 26, 2013
The purpose of this class is to run/test classes and includes the
public static void main method.
*/

public class Test {
	public static void main(String[] args){

		Account account = new Account(1122, 20000.00, 4.50);
		System.out.println(
				"Hello.\n" +
				"Current balance for account number " + account.getID() + " is: $" + account.getBalance() +
				"\nWithdrawing $4,500.00...");
		account.withdraw(4500.00);
		System.out.println(
				"Current balance for account number " + account.getID() + " is: $" + account.getBalance() +
			"\nDepositing $2,500.00...");
		account.deposit(2500.00);
		System.out.println(
				"Current balance is now: $" + account.getBalance() + " with the monthly interest of $" + account.getMonthlyInterest() +
				"\nThis account was created on " + account.getDateCreated() + ".\nGoodbye.");
	}
}