package question1_Even_Integer;
import java.util.Scanner;
public class Tester {
	public static void main (String agrs[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("�˰���� �������� �Է��ϼ���.");
		Find_even target = new Find_even(input.nextInt());
		if (target.answer())
		{
			System.out.println("¦���Դϴ�.");
		}
		else
		{
			System.out.println("¦���� �ƴմϴ�.");
		}
	}
}
