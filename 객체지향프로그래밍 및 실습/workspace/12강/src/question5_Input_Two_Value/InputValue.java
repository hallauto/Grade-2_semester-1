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
				System.out.println("�߸��� �Է��Դϴ�. ���� ��ȸ:"+(--chance));
			}
			System.out.println("���ڸ� �Է��ϼ���");
		}
		return returnSum;
	}

}
