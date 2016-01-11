package question6_Bank;

import java.util.Scanner;

public class BankAccount {
	int balance,accountNumber;
	BankAccount(int accountNumber, int balance)
	{
		if ((balance<0)||(accountNumber<0))
		{
			throw new IllegalArgumentException("�뷱�� �Ǵ� ���� ��ȣ�� �����Դϴ�!");
		}
		this.balance=balance;
		this.accountNumber=accountNumber;
	}
	public int getAccountNumber()
	{
		return accountNumber;
	}
	public int getBalance()
	{
		return balance;
	}
	public void deposit(int depositMoney)
	{
		if (depositMoney<0)
		{
			throw new IllegalArgumentException("���� �Է��Ѵٰ� ��� �ȵ˴ϴ�. ��� �޼ҵ� ���� �����ϱ� 9ó�� �������� ���� ��� �޼ҵ� ������");
		}
		balance+=depositMoney;
	}
	public void withDraw (int withDrawMoney)
	{
		if ((0>withDrawMoney)||(balance<withDrawMoney))
		{
			throw new IllegalArgumentException("������ �Է��Ѵٰ� �Ա� �ȵ˴ϴ�. �׸��� ���̳ʽ� ���� ������ �ȵǿ�.");
		}
		balance-=withDrawMoney;
	}
}
