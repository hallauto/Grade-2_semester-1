package question;
import java.util.Scanner;
public class Question5 {
	public static void main(String agrs[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Object oriented Programming with Using JAVA를 치세요");
		String answer=input.nextLine();
		System.out.println("전부 대문자 출력:"+ answer.toUpperCase());
		System.out.println("전부 소문자 출력:"+ answer.toLowerCase());
		System.out.println("글자 수:"+answer.length());
		System.out.println("o를 k로 바꾸고 출력:"+answer.replaceAll("o","k"));
	}
}
