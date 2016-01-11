package question3_Duplicate;
import java.util.Scanner;
public class Tester {
	public static void main(String agrs[])
	{
		int length;
		Scanner input = new Scanner(System.in);
		System.out.println("배열의 크기를 입력하세요.");
		length=input.nextInt();
		int [] that = new int [length];
		for (int i=0;i<length;i++)
		{
			System.out.println((i+1)+"번째 숫자 입력");
			that[i]=input.nextInt();
		}
		Duplicate lets = new Duplicate(that,length);
		if (lets.search())
		{
			System.out.println("겹치는게 있습니다.");
		}
		else
		{
			System.out.println("겹치는게 없습니다.");
		}
	}
}
