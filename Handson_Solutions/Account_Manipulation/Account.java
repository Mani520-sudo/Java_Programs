package Account_Manipulation;

public abstract class Account
{
	protected int accountNumber;
	protected Customer customerObj;
	protected double balance;
	
	public Account(int accountNumber,Customer customerObj,double balance)
	{
		this.accountNumber = accountNumber;
		this.customerObj = customerObj;
		this.balance = balance;
	}
	public abstract boolean withdraw(double amount);
}
