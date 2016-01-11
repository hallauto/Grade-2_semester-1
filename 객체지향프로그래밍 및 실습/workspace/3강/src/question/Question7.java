package question;
import java.util.Random;
public class Question7 {
	public static void main(String args[])
	{
		Random choice = new Random();
		System.out.println("주사위 던집니다\n" + (choice.nextInt(100)+1));
	}
}
