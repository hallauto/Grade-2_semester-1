package question;
import java.util.Scanner;
public class Question5 {
	public static void main(String agrs[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Object oriented Programming with Using JAVA�� ġ����");
		String answer=input.nextLine();
		System.out.println("���� �빮�� ���:"+ answer.toUpperCase());
		System.out.println("���� �ҹ��� ���:"+ answer.toLowerCase());
		System.out.println("���� ��:"+answer.length());
		System.out.println("o�� k�� �ٲٰ� ���:"+answer.replaceAll("o","k"));
	}
}
