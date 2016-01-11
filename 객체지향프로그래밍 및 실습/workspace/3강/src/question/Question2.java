package question;
import java.util.Scanner;
public class Question2 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String letter=new String();
		String sub_letter1=new String();
		String sub_letter2=new String();
		String sub_letter3=new String();
		System.out.println("문자열 입력");
		letter=sc.nextLine();
		sub_letter1=letter.substring(0,1);
		sub_letter2=letter.substring(2,3);
		sub_letter3=letter.substring(4,5);
		System.out.println(sub_letter1 + sub_letter2 + sub_letter3);
	}
}
