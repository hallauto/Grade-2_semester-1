package question4_BankAccount;

import java.util.Scanner;

public class BankAccount {
	int balance;
	BankAccount(int balance)
	{
		if (balance<0)
		{
			throw new IllegalArgumentException("�뷱���� �����Դϴ�!");
		}
		this.balance=balance;
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
