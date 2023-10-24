package BankAccountDetails;

public class Main {

	public static void main(String[] args)
	{
		AccountDetails a1 = new AccountDetails();
		Account a = a1.getAccountDetails();
		a.withdraw(a1.getWithdrawAmount());
		
	}

}
