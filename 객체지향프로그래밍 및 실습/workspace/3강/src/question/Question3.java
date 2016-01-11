package question;
import java.util.Scanner;
public class Question3 {
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("시간을 입력하세요");
		int hour=input.nextInt();
		System.out.println("분을 입력하세요");
		int minute=input.nextInt();
		System.out.println("초를 입력하세요");
		int second=input.nextInt();
		System.out.println(3600*hour+60*minute+second + "초");
	}
}

