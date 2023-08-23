package com.banking;

public class Banking
{
  static int CurrentBalance = 1000;

  //To print the current balance
  public static void getCurrentBalance() {
	  System.out.println(CurrentBalance);
  }
  //Deposit
  public void deposit(int amount){
	  CurrentBalance=CurrentBalance+amount;
	  System.out.printf("Your Current Balance is %d %n",CurrentBalance);
	  System.out.println("Money Deposited Succesfully");
  }
  //Withdraw
  public static void withdrawl(int amount){
	  CurrentBalance=CurrentBalance-amount;
	  System.out.println(CurrentBalance);
	  System.out.println("Money Withdrawl Succesfull");
  }
  public static void main(String[] args) {
  	Banking a = new Banking();
  	a.deposit(1000);
  	
  	
  }
  

}

