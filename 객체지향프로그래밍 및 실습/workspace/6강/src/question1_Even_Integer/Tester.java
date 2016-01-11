package question1_Even_Integer;
import java.util.Scanner;
public class Tester {
	public static void main (String agrs[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("알고싶은 정수값을 입력하세요.");
		Find_even target = new Find_even(input.nextInt());
		if (target.answer())
		{
			System.out.println("짝수입니다.");
		}
		else
		{
			System.out.println("짝수가 아닙니다.");
		}
	}
}
