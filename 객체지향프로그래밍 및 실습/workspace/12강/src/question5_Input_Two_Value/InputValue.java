package question5_Input_Two_Value;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputValue {
	int chance=2;
	float sum;
	Scanner input = new Scanner(System.in);
	InputValue()
	{
		sum += numberinput();
	}
	public float numberinput()
	{
		int returnSum=0;
		while (chance>0)
		{
			try
			{
				returnSum+=input.nextFloat();
			}
			catch (InputMismatchException exception)
			{
				input.nextLine();
				System.out.println("잘못된 입력입니다. 남은 기회:"+(--chance));
			}
			System.out.println("숫자를 입력하세요");
		}
		return returnSum;
	}

}
