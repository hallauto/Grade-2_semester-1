package question;
import java.util.Scanner;
import java.util.StringTokenizer;
public class Question6 {
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("ют╥б");
		String string=input.nextLine();
		StringTokenizer ST=new StringTokenizer(string);
		System.out.print(ST.countTokens());
	}
}
