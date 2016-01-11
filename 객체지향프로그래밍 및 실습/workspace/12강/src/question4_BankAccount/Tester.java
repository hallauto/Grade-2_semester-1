package question4_BankAccount;

import java.util.Scanner;

public class Tester {
	public static void main(String agsr[])
	{
		BankAccount myAccount = new BankAccount(5000);
		myAccount.deposit(1000);
		myAccount.withDraw(550000000);
		System.out.println("ÇöÀç ÀÜ¾×:"+myAccount.balance);
	}
}
