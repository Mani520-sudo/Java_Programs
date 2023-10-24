package BankAccountDetails;

import java.util.*;

public class AccountDetails
{
	public Account getAccountDetails()
	{
		Account a = new Account();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter account id:");
		int aid = s.nextInt();
		a.setAccountId(aid);
		System.out.println("Enter account type:");
		String atype = s.next();
		a.setAccountType(atype);
		while(true)
		{
			System.out.println("Enter balance:");
			int bl = s.nextInt();
			if(bl > 0)
			{
				a.setBalance(bl);
				break;
			}
			else
			{
				System.out.println("Balance should be positive");
			}
		}
		return a;
		
	}
	public int getWithdrawAmount()
	{
		Scanner s = new Scanner(System.in);
		int gwa1 = 0;
		while(true)
		{
			System.out.println("Enter amount to be withdrawn:");
			int gwa = s.nextInt();
			if(gwa > 0)
			{
				gwa1 = gwa;
				break;
			}
			else
			{
				System.out.println("Amount should be positive");
			}
			
			
		}
		return gwa1;
	}
}
