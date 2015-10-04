/*Account Class
Jason Rimer
October 26, 2013
The purpose of this class is to act as a bank account with the ability
to construct a class with an ID, balance, and annual interest rate determined
by the user. The class gets the date the account was created and provides access
to those four instance variables. Also, the class allows the user to mutate the balance
by withdrawing and depositing funds.
Methods are grouped as accessors then mutators and in alphabetical order by method name.
*/
public class Account {
	private double annualInterestRate;
	private double balance;
	private java.util.Date dateCreated;
	private int ID;
	//no-arg constructor
	public Account(){
		this(0, 0.0, 0.0);
		
	}
	//triple-arg constructor
	public Account(int ID, double balance, double annualInterestRate){
		this.ID = ID;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate / 100;
		dateCreated = new java.util.Date();
	}
	//accessor methods
	public double getAnnualInterestRate(){
		return annualInterestRate;
	}
	public double getBalance(){
		return balance;
	}
	public java.util.Date getDateCreated(){
		return dateCreated;
	}
	public double getMonthlyInterest(){
		return balance * annualInterestRate / 12;
	}
	public int getID(){
		return ID;
	}
	//all mutator methods
	public void deposit(double depositAmmount){
		this.balance -= depositAmmount;
	}
	public void setAnnualInterestRate(double annualInterestRate){
		this.annualInterestRate = annualInterestRate / 100;
	}
	public void setBalance(double balance){
		this.balance = balance;
	}
	public void setID(int ID){
		this.ID = ID;
	}
	public void withdraw(double withdrawAmmount) {
		this.balance -= withdrawAmmount;
	}
}
