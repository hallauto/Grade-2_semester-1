package question;
import java.util.Scanner;
public class Question4 {
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력하세요");
		int a=input.nextInt();
		System.out.println("두번째 숫자를 입력하세요");
		int b=input.nextInt();
		System.out.print(Math.max(a,b));
	}
}
