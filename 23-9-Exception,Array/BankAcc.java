package com.a239;

public class BankAcc 
{
	
	int deposit, withdraw;
	private int balance = 2000;
	
	public int balance()
	{
		return balance;
	}
	
	void deposit(int amount)
	{
		balance += amount;
	}
	
	void withdraw(int amount) throws InsufficientFundException
	{
		
		if(amount > balance)
		{
			throw new InsufficientFundException(String.format("Sorry, insufficient balance, you need more %d Rs.\nTo perform "
					+ "this transaction",(amount-balance)));
		}
		else
		{
			balance -= amount;
			System.out.println(balance);
		}
		
	}
	
	public static void main(String[] args) throws InsufficientFundException 
	{
		BankAcc b1 =new BankAcc();
		
		System.out.println("Your Current Balance: "+b1.balance());
		
		b1.withdraw(3000);
		
		
		
	}
}
