package question5_Exception;

import java.util.Scanner;

public class Tester {
	public static void main(String args[])
	{
		try{
			Scanner input = new Scanner(System.in);
			String text = input.next();
			if (text.length()>8)
			{
				throw new ExceptionLineTooLong();
			}
			else
				System.out.println(text);
		}
		catch (ExceptionLineTooLong e)
		{
			System.out.println("�ʹ� ��ϴ�.");
		}
	}
	public static class ExceptionLineTooLong extends IllegalArgumentException
	{
		ExceptionLineTooLong()
		{
			super();
		}
	}
}
