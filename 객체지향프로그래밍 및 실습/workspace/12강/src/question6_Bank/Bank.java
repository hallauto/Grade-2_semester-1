package question6_Bank;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class Bank {
	ArrayList<BankAccount> accountList = new ArrayList<BankAccount>();
	short chance = 2;
	public void readFile(String filename) throws IOException
	{
		FileReader readFile = null;
		if (chance>0)
		{
			try
			{
				readFile = new FileReader(filename);
				Scanner input = new Scanner(readFile);
				while (input.hasNext())
				{
					int accountnumber = input.nextInt();
					int balance = input.nextInt();
					BankAccount account = new BankAccount(accountnumber,balance);
					accountList.add(account);
				}
				readFile.close();
				return;
			}
			catch (FileNotFoundException fe)
			{
				System.out.println("ã���ô� ������ �����ϴ�.\n�ٸ� �̸��� �Է��ϼ���");
				chance--;
				System.out.println(chance);
				throw new IOException();
			}
			catch (InputMismatchException e)
			{
				System.out.println("�ٸ� ������ ������ �ԷµǾ����ϴ�. �ٽ� �Է��ϼ���");
				chance--;
				readFile.close();
				throw new IOException();
			}
		}
		else
		{
			System.out.println("��� ��ȸ�� ����߽��ϴ�.");
		}
	}
	public BankAccount getHighestBalance()
	{
		BankAccount highest=null;
		try
		{
			if (accountList.isEmpty())
			{
				System.out.println("����Ʈ�� ����ֽ��ϴ�.");
				throw new NullPointerException();
			}
			else
			{
				highest=accountList.get(0);
			}
			for (int i=1;i<accountList.size();i++)
			{
				if (highest.getBalance()<accountList.get(i).getBalance())
				{
					highest=accountList.get(i);
				}
			}
		}
		catch (NullPointerException e)
		{
			System.out.println("����Ʈ�� ������ �ֽ��ϴ�.");
		}
		return highest;
	}
}
