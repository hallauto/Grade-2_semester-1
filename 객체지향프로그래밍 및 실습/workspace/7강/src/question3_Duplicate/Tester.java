package question3_Duplicate;
import java.util.Scanner;
public class Tester {
	public static void main(String agrs[])
	{
		int length;
		Scanner input = new Scanner(System.in);
		System.out.println("�迭�� ũ�⸦ �Է��ϼ���.");
		length=input.nextInt();
		int [] that = new int [length];
		for (int i=0;i<length;i++)
		{
			System.out.println((i+1)+"��° ���� �Է�");
			that[i]=input.nextInt();
		}
		Duplicate lets = new Duplicate(that,length);
		if (lets.search())
		{
			System.out.println("��ġ�°� �ֽ��ϴ�.");
		}
		else
		{
			System.out.println("��ġ�°� �����ϴ�.");
		}
	}
}
