package question;
import java.util.Scanner;
public class Question3 {
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("�ð��� �Է��ϼ���");
		int hour=input.nextInt();
		System.out.println("���� �Է��ϼ���");
		int minute=input.nextInt();
		System.out.println("�ʸ� �Է��ϼ���");
		int second=input.nextInt();
		System.out.println(3600*hour+60*minute+second + "��");
	}
}

